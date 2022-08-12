package com.itau.zendesk.core.port

import com.itau.zendesk.core.model.Post

interface PostPort {
    fun getPostById(id: String?): Post

    fun getAllPost(): List<Post>
}