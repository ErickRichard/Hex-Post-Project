package com.itau.zendesk.entrypoint.rest.model

import com.fasterxml.jackson.annotation.JsonProperty

data class PostResponse(
    @JsonProperty("id")
    val id: String,
    @JsonProperty("userId")
    val userId: String,
    @JsonProperty("title")
    val title: String,
    @JsonProperty("body")
    val body: String
)