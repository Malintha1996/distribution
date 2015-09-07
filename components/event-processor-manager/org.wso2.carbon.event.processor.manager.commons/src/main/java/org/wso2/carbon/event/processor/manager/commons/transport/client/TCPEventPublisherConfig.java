/*
 * Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.event.processor.manager.commons.transport.client;

public class TCPEventPublisherConfig {

    private int bufferSize = 1024;
    private String charset = "UTF-8";
    private int tcpSendBufferSize = 5242880;
    private long connectionStatusCheckInterval = 30 * 1000;

    public int getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public int getTcpSendBufferSize() {
        return tcpSendBufferSize;
    }

    public void setTcpSendBufferSize(int tcpSendBufferSize) {
        this.tcpSendBufferSize = tcpSendBufferSize;
    }

    public long getConnectionStatusCheckInterval() {
        return connectionStatusCheckInterval;
    }

    public void setConnectionStatusCheckInterval(long connectionStatusCheckInterval) {
        this.connectionStatusCheckInterval = connectionStatusCheckInterval;
    }
}
