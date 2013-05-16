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
package org.wso2.siddhi.query.api.query.input.pattern.element;

import org.wso2.siddhi.query.api.query.input.TransformedStream;

public class LogicalElement implements PatternElement {
    TransformedStream transformedStream1;
    LogicalElement.Type type;
    TransformedStream transformedStream2;

    public LogicalElement(TransformedStream transformedStream1, Type type,
                          TransformedStream transformedStream2) {
        this.transformedStream1 = transformedStream1;
        this.type = type;
        this.transformedStream2 = transformedStream2;
    }

    public TransformedStream getTransformedStream1() {
        return transformedStream1;
    }

    public TransformedStream getTransformedStream2() {
        return transformedStream2;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        AND, OR
    }
}
