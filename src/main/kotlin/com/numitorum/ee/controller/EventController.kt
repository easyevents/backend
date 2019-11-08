package com.numitorum.ee.controller

import mu.KotlinLogging
import org.postgresql.jdbc.EscapedFunctions.LOG
import org.springframework.http.HttpStatus.OK
import org.springframework.http.HttpStatus.CREATED
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class EventController() {
    @ResponseStatus(CREATED)
    @GetMapping("/create-event")
    fun createEvent() =
            LOG.info { "" }
                    .let { "OK" }

    @ResponseStatus(OK)
    @GetMapping("/get-event/{id}")
    fun getEvent() =
            LOG.info { "" }
                    .let { "OK" }

    @ResponseStatus(OK)
    @PutMapping("/update-event/{id}")
    fun updateEvent() =
            LOG.info { "" }
                    .let { "OK" }

    @ResponseStatus(OK)
    @GetMapping("/delete-event/{id}")
    fun archiveEvent() =
            LOG.info { "" }
                    .let { "OK" }

    companion object {
        private val LOG = KotlinLogging.logger { }
    }
}