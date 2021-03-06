// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IManagedDeviceResetPasscodeRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceResetPasscodeRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed Device Reset Passcode Request Builder.
 */
public class BaseManagedDeviceResetPasscodeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this ManagedDeviceResetPasscode
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseManagedDeviceResetPasscodeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IManagedDeviceResetPasscodeRequest
     *
     * @return the IManagedDeviceResetPasscodeRequest instance
     */
    public IManagedDeviceResetPasscodeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IManagedDeviceResetPasscodeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceResetPasscodeRequest instance
     */
    public IManagedDeviceResetPasscodeRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagedDeviceResetPasscodeRequest request = new ManagedDeviceResetPasscodeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
