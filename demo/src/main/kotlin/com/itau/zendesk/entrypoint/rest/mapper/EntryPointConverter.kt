package com.itau.zendesk.entrypoint.rest.mapper

import com.itau.zendesk.core.model.Post
import com.itau.zendesk.entrypoint.rest.model.PostResponse as PostResp
import com.itau.zendesk.infrastructure.model.Post as postInf

class EntryPointConverter {
    companion object {
        fun toPostResponse(obj: Post): PostResp {
            return PostResp(
                userId = obj.userId,
                id = obj.id,
                title = obj.title,
                body = obj.body
            )
        }


        fun toPostListResponse(obj: List<Post>): List<PostResp> {
            val destinationObject: ArrayList<PostResp> = ArrayList()
            for (item in obj) {
                destinationObject.add(createPostObject(item))
            }
            return destinationObject
        }

        private fun createPostObject(post: Post): PostResp {
            return PostResp(
                id = post.id,
                userId = post.userId,
                title = post.title,
                body = post.body
            )
        }
    }
}