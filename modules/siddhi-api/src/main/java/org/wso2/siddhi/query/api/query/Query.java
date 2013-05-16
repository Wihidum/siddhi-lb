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
package org.wso2.siddhi.query.api.query;

import org.wso2.siddhi.query.api.ExecutionPlan;
import org.wso2.siddhi.query.api.query.input.BasicStream;
import org.wso2.siddhi.query.api.query.output.OutStream;
import org.wso2.siddhi.query.api.query.projection.Projector;
import org.wso2.siddhi.query.api.query.input.AnonymousStream;
import org.wso2.siddhi.query.api.query.input.Stream;

public class Query implements ExecutionPlan {

    private Stream inputStream;
    private Projector projector=new Projector();
    private OutStream outStream;

    public Query from(Stream stream) {
        this.inputStream = stream;
        return this;
    }

    public Query insertInto(String outputStreamId) {
        this.outStream =new OutStream(outputStreamId);
        return this;
    }

    public Query insertInto(String outputStreamId, String ip) {
        this.outStream =new OutStream(outputStreamId,ip);
        return this;
    }


    public Query outStream(OutStream outStream) {
        this.outStream =outStream;
        return this;
    }

    public Query project(Projector projector) {
        this.projector = projector;
        return this;
    }


    public BasicStream returnStream() {
       return new AnonymousStream(this);
    }

    public Stream getInputStream() {
        return inputStream;
    }

    public OutStream getOutputStream() {
        return outStream;
    }

    public Projector getProjector() {
        return projector;
    }

    public Query insertInto( String outputStreamId,OutStream.OutputEvents outputEvents) {
        this.outStream= new OutStream(outputStreamId,outputEvents);
        return this;
    }

    public Query insertInto( String outputStreamId,String ip, OutStream.OutputEvents outputEvents) {
        this.outStream= new OutStream(outputStreamId,ip,outputEvents);
        return this;
    }
}
