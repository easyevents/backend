package com.numitorum.ee.controller

import mu.KotlinLogging
import org.postgresql.jdbc.EscapedFunctions.LOG
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.HttpStatus.OK

@RestController
@RequestMapping("/api/v1")
class NeprodController() {
    @ResponseStatus(OK)
    @GetMapping("/try")
    fun createReport() =
            LOG.info { "" }
                    .let { "OK" }
    companion object {
        private val LOG = KotlinLogging.logger { }
    }
}