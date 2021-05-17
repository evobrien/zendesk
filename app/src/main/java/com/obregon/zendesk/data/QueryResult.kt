package com.obregon.zendesk.data


sealed class QueryResult{
    data class Success(val successPayload:Any) : QueryResult()
    data class Failure(val exception: Exception) : QueryResult()
}