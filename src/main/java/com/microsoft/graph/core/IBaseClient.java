// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sub-license, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.core;

import com.microsoft.graph.authentication.IAuthenticationProvider;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.http.IHttpProvider;
import com.microsoft.graph.logger.ILogger;
import com.microsoft.graph.serializer.ISerializer;

/**
 * A client that communications with an OData service.
 */
public interface IBaseClient {

    /**
     * Gets the authentication provider.
     * @return The authentication provider.
     */
    IAuthenticationProvider getAuthenticationProvider();

    /**
     * Gets the service root.
     * @return The service root.
     */
    String getServiceRoot();

    /**
     * Sets the service root.
     * @param value The service root
     */
    void setServiceRoot(final String value);

    /**
     * Gets the executors.
     * @return The executors.
     */
    IExecutors getExecutors();

    /**
     * Gets the HTTP provider.
     * @return The HTTP provider.
     */
    IHttpProvider getHttpProvider();

    /**
     * Gets the logger.
     * @return The logger.
     */
    ILogger getLogger();

    /**
     * Gets the serializer.
     * @return The serializer.
     */
    ISerializer getSerializer();

    /**
     * Validates this client.
     */
    void validate();
}