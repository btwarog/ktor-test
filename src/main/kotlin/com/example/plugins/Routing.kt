package com.example.plugins

import com.example.models.customerStorage
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.delete
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import io.ktor.server.routing.routing


fun Application.configureRouting() {
    routing {
        route("/customers") {
            get {
                if (customerStorage.isNotEmpty()) {
                    call.respond(customerStorage)
                } else {
                    call.respondText("No customers found", status = HttpStatusCode.OK)
                }
            }
        }
        route("/customer") {
            get("{id?}") {

            }
            post {

            }
            delete("{id?}") {

            }
        }
    }
}
