package com.itau.zendesk.entrypoint.rest.adapter

import com.itau.zendesk.core.port.EntryPoint
import com.itau.zendesk.core.service.GetPostById
import com.itau.zendesk.entrypoint.rest.mapper.EntryPointConverter
import com.itau.zendesk.entrypoint.rest.model.PostResponse
import org.springframework.stereotype.Service

@Service
class EntryPointAdapter(
    private val getPostById: GetPostById
) : EntryPoint {
    override fun getPostById(id: String): PostResponse {
        val result = getPostById.executeFindPost(
            id = id
        )
        return EntryPointConverter.toPostResponse(result)
    }

    override fun getAllPost(): List<PostResponse> {
        val result = getPostById.executeFindAllPost()
        return EntryPointConverter.toPostListResponse(result)

    }
}