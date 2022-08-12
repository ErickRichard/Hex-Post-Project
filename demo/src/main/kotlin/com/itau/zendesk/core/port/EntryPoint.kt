package com.itau.zendesk.core.port

import com.itau.zendesk.core.service.GetPostById
import com.itau.zendesk.entrypoint.rest.model.PostResponse

interface EntryPoint {
    fun getPostById(id: String): PostResponse

    fun getAllPost(): List<PostResponse>
}