// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.requests.extensions.INotebookCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Notebook Collection Page.
 */
public class BaseNotebookCollectionPage extends BaseCollectionPage<Notebook, INotebookCollectionRequestBuilder> implements IBaseNotebookCollectionPage {

    /**
     * A collection page for Notebook
     *
     * @param response the serialized BaseNotebookCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseNotebookCollectionPage(final BaseNotebookCollectionResponse response, final INotebookCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
