/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.acme;

public class QueryRequest {

    private String processInstanceId;
    private String query;

    public QueryRequest() {
    }

    public QueryRequest(String processInstanceId, String query) {
        this.processInstanceId = processInstanceId;
        this.query = query;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public String getQuery() {
        return query;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public String toString() {
        return "QueryRequest{" +
                "processInstanceId='" + processInstanceId + '\'' +
                ", query='" + query + '\'' +
                '}';
    }
}
