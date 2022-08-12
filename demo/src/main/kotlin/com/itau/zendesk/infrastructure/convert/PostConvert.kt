package com.itau.zendesk.infrastructure.convert

import com.itau.zendesk.core.model.Post
import com.itau.zendesk.entrypoint.rest.model.PostResponse
import com.itau.zendesk.infrastructure.model.Post as PostMd

class PostConvert {
    companion object {
        fun toPost(obj: PostMd): Post {
            return Post(
                userId = obj.userId,
                id = obj.id,
                title = obj.title,
                body = obj.body
            )
        }

        fun toPostListResponse(obj: List<PostMd>): List<Post> {
            val destinationObject: ArrayList<Post> = ArrayList()
            for (item in obj) {
                destinationObject.add(createPostObject(item))
            }
            return destinationObject
        }

        private fun createPostObject(postInf: PostMd): Post {
            return Post(
                userId = postInf.userId,
                id = postInf.id,
                title = postInf.title,
                body = postInf.body
            )
        }
    }
}