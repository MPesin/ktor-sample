package com.mpesin.ktor.sample

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.mpesin.ktor.sample.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSockets()
        configureSecurity()
    }.start(wait = true)
}
