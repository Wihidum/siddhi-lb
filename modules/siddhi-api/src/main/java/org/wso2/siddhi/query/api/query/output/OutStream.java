/*
*  Copyright (c) 2005-2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.siddhi.query.api.query.output;

import java.util.List;

public class OutStream {
    public enum OutputEvents {
        EXPIRED_EVENTS, CURRENT_EVENTS, ALL_EVENTS
    }

    String streamId;
    List<String> ip;
    OutputEvents outputEvents;

    public OutStream(String streamId, OutputEvents outputEvents) {
        this.streamId = streamId;
        this.outputEvents = outputEvents;
    }

    public OutStream(String streamId, List<String> ip, OutputEvents outputEvents) {
        this.streamId = streamId;
        this.ip = ip;
        this.outputEvents = outputEvents;
    }

    public OutStream(String streamId) {
        this.streamId = streamId;
        this.outputEvents = OutputEvents.CURRENT_EVENTS;
    }

    public OutStream(String streamId, List<String> ip) {
        this.streamId = streamId;
        this.ip = ip;
        this.outputEvents = OutputEvents.CURRENT_EVENTS;
    }

    public String getStreamId() {
        return streamId;
    }

    public List<String> getIp() {
        return ip;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public OutStream setIp(List<String> ip){
        this.ip =ip;
        return this;
    }

    public OutputEvents getOutputEvents() {
        return outputEvents;
    }

    public void setOutputEvents(OutputEvents outputEvents) {
        this.outputEvents = outputEvents;
    }
}
