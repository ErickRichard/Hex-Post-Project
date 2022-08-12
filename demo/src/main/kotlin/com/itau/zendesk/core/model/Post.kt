package com.itau.zendesk.core.model

data class Post(
    val id: String = String(),
    val userId: String = String(),
    val title: String = String(),
    val body: String = String()
)