package com.itau.zendesk.infrastructure.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Post(
    @JsonProperty("id")
    val id: String,
    @JsonProperty("userId")
    val userId: String,
    @JsonProperty("title")
    val title: String,
    @JsonProperty("body")
    val body: String
)
