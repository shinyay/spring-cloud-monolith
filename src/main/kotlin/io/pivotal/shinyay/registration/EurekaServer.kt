package io.pivotal.shinyay.registration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaServer {
    fun main(args: Array<String>) {
        runApplication<EurekaServer>(*args)
    }
}