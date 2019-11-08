package com.numitorum.ee

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@EnableConfigurationProperties
//@ComponentScan("com.numitorum.ee")
class EasyEventsApplication

fun main(args: Array<String>) {
    runApplication<EasyEventsApplication>(*args)
}
