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
package org.wso2.siddhi.core.query.projector.attribute.handler.avg;

import org.wso2.siddhi.core.query.projector.attribute.handler.OutputAttributeProcessor;
import org.wso2.siddhi.query.api.definition.Attribute;

public class AvgOutputAttributeProcessorInt implements OutputAttributeProcessor {

    private double value = 0.0;
    private long count = 0;
    private  static final Attribute.Type type = Attribute.Type.DOUBLE;

    public Attribute.Type getType() {
        return this.type;
    }

    @Override
    public Object processInEventAttribute(Object obj) {
        count++;
        value += (Integer) obj;
        if (count == 0) {
            return 0;
        }
        return value / count;
    }

    @Override
    public Object processRemoveEventAttribute(Object obj) {
        count--;
        value -= (Integer) obj;
        if (count == 0) {
            return 0;
        }
        return value / count;
    }

    @Override
    public OutputAttributeProcessor createNewInstance() {
        return new AvgOutputAttributeProcessorInt();
    }
}
