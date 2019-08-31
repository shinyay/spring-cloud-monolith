package io.pivotal.shinyay.domain.addition

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
class AdditionServer {
    val logger: Logger = LoggerFactory.getLogger(this.javaClass.name)
}

fun runAdditionServer(args: Array<String>) {
    System.setProperty("spring.config.name", "addition-server")
    runApplication<AdditionServer>(*args)
}