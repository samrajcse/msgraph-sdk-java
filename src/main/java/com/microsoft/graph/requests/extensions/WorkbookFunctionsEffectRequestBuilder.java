// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsEffectRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Effect Request Builder.
 */
public class WorkbookFunctionsEffectRequestBuilder extends BaseWorkbookFunctionsEffectRequestBuilder implements IWorkbookFunctionsEffectRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsEffect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param nominalRate the nominalRate
     * @param npery the npery
     */
    public WorkbookFunctionsEffectRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement nominalRate, final com.google.gson.JsonElement npery) {
        super(requestUrl, client, requestOptions, nominalRate, npery);
    }
}
