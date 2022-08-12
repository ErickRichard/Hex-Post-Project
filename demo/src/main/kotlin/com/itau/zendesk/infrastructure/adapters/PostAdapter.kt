package com.itau.zendesk.infrastructure.adapters

import com.itau.zendesk.core.model.Post
import com.itau.zendesk.core.port.PostPort
import com.itau.zendesk.infrastructure.client.PostClient
import com.itau.zendesk.infrastructure.convert.PostConvert
import org.springframework.stereotype.Service

@Service
class PostAdapter(private val postClient: PostClient) : PostPort {

    override fun getPostById(id: String?): Post {
        val response = postClient.getPostByFeignId(id = id).body
        return PostConvert.toPost(response!!)
    }

    override fun getAllPost(): List<Post> {
        val response = postClient.getAllPostByFeign().body
        return PostConvert.toPostListResponse(response!!)
    }
}