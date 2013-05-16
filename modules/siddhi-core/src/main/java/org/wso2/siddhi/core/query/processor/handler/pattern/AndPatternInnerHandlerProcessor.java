/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.siddhi.core.query.processor.handler.pattern;

import org.apache.log4j.Logger;
import org.wso2.siddhi.core.config.SiddhiContext;
import org.wso2.siddhi.core.event.AtomicEvent;
import org.wso2.siddhi.core.event.StateEvent;
import org.wso2.siddhi.core.event.StreamEvent;
import org.wso2.siddhi.core.query.processor.filter.FilterProcessor;
import org.wso2.siddhi.core.statemachine.pattern.AndPatternState;

public class AndPatternInnerHandlerProcessor extends PatternInnerHandlerProcessor {
    static final Logger log = Logger.getLogger(AndPatternInnerHandlerProcessor.class);
    private int lowerState;
    private int higherState;

    public AndPatternInnerHandlerProcessor(AndPatternState state,
                                           FilterProcessor firstSimpleQueryStreamProcessor,
                                           int complexEventSize, SiddhiContext siddhiContext, String nodeId) {
        super(state, firstSimpleQueryStreamProcessor, complexEventSize,siddhiContext, nodeId);

        if (state.getStateNumber() < state.getPartnerState().getStateNumber()) {
            lowerState = state.getStateNumber();
            higherState = state.getPartnerState().getStateNumber();
        } else {
            higherState = state.getStateNumber();
            lowerState = state.getPartnerState().getStateNumber();
        }

    }

    @Override
    public void process(StreamEvent event) {
        if (log.isDebugEnabled()) {
            log.debug("ar state=" +currentState+" event="+ event+" ||eventBank="+currentEvents);
        }
//        System.out.println("next "+nextEvents);
        for (StateEvent currentEvent : getCollection()) {

            if (currentEvent.getEventState() != higherState) {
                currentEvent.setStreamEvent(currentState, event);
                StateEvent newEvent = (StateEvent) filterProcessor.process(currentEvent);
                if (newEvent != null) {
                    processSuccessEvent(newEvent);
                } else {
                    currentEvent.setStreamEvent(currentState, null);
                    addToNextEvents(currentEvent);
                }
            }
        }
    }

    protected void setEventState(StateEvent eventBundle) {
        if (eventBundle.getEventState() == lowerState) {
            eventBundle.setEventState(higherState);
        } else {
            eventBundle.setEventState(lowerState);
        }
    }

    protected void sendEvent(AtomicEvent atomicEvent) {
        if (((StateEvent) atomicEvent).getEventState() == higherState) {
            queryProjector.process(atomicEvent);
        }
    }

    protected void passToNextStates(StateEvent eventBundle) {
        super.passToNextStates(eventBundle);
        if (distributedProcessing) {
            if (currentState == higherState) {
                ((AndPatternState) state).getPartnerState().getInnerHandlerProcessor().updateToCurrentEvents(eventBundle, higherState);
            } else if (currentState == lowerState) {
                ((AndPatternState) state).getPartnerState().getInnerHandlerProcessor().updateToNextEvents(eventBundle, lowerState);
            }
        }

    }

}
