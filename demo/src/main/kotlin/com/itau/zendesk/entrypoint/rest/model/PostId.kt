package com.itau.zendesk.entrypoint.rest.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.web.bind.annotation.ModelAttribute

@JsonIgnoreProperties
data class PostId(
    @ModelAttribute
    val value: String
)
