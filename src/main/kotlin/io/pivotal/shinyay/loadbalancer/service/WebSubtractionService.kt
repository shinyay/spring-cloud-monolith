package io.pivotal.shinyay.loadbalancer.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class WebSubtractionService {

    val serviceUrl: String = "http://subtraction-service"

    val logger: Logger = LoggerFactory.getLogger(this.javaClass.name)

    @Autowired
    lateinit var restTemplate: RestTemplate

    fun sub(param1: String, param2: String) =
            restTemplate.getForObject("$serviceUrl/sub?param1=$param1&param2=$param2", String::class.java)
}