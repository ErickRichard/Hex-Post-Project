package com.itau.zendesk.core.service

import com.itau.zendesk.core.model.Post
import com.itau.zendesk.core.port.PostPort
import org.springframework.stereotype.Service

@Service
class GetPostById(private val post: PostPort) {

    fun executeFindPost(id: String): Post {
        return post.getPostById(id)
    }

    fun executeFindAllPost(): List<Post> {
        return post.getAllPost()
    }
}