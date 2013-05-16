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
package org.wso2.siddhi.core.query.projector.attribute.handler.sum;

import org.wso2.siddhi.core.query.projector.attribute.handler.OutputAttributeProcessor;
import org.wso2.siddhi.query.api.definition.Attribute;

public class SumOutputAttributeProcessorInt implements OutputAttributeProcessor {

    private long value = 0L;
    private  static final Attribute.Type type = Attribute.Type.LONG;

    public Attribute.Type getType() {
        return type;
    }

    @Override
    public Object processInEventAttribute(Object obj) {
        value += ((Integer) obj).longValue();
        return value;
    }

    @Override
    public Object processRemoveEventAttribute(Object obj) {
        value -= ((Integer) obj).longValue();
        return value;
    }

    @Override
    public OutputAttributeProcessor createNewInstance() {
        return new SumOutputAttributeProcessorInt();
    }
}
