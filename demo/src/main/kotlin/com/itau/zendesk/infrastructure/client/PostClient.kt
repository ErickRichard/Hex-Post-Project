package com.itau.zendesk.infrastructure.client

import com.itau.zendesk.infrastructure.model.Post
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


@FeignClient(value = "Post", url = "\${api.post.url}")
interface PostClient {

    @GetMapping("/posts/{id}")
    fun getPostByFeignId(@PathVariable("id") id: String?): ResponseEntity<Post>

    @GetMapping("/posts")
    fun getAllPostByFeign(): ResponseEntity<List<Post>>
}