package com.itau.zendesk.entrypoint.rest.controller

import com.itau.zendesk.core.port.EntryPoint
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.itau.zendesk.entrypoint.rest.model.PostId

@RestController
@RequestMapping("/")
@Validated
class EntryPointController(
    private val entryPoint: EntryPoint
) {

    @GetMapping("/all")
    fun searchAllPost(): ResponseEntity<Any> {
        val response = entryPoint.getAllPost()
        return ResponseEntity.ok(response)
    }

    @GetMapping("/id/{id_post}")
    @ResponseBody
    fun searchPostById(@PathVariable(value = "id_post") postId: PostId): ResponseEntity<Any> {
        val response = entryPoint.getPostById(id = postId.value)
        return ResponseEntity.ok(response)
    }

}