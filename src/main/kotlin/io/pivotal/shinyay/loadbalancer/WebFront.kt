package io.pivotal.shinyay.loadbalancer

import io.pivotal.shinyay.loadbalancer.service.WebAdditionService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EnableDiscoveryClient
class WebFront {

    //val ADDITION_URL = "http://addition-service"
    //val SUBTRACTION_URL = "http://subtraction-service"

    @LoadBalanced
    @Bean
    fun restTemplate() = RestTemplate()

    @Bean
    fun additionService() = WebAdditionService()

}

fun runFrontServer(args: Array<String>) {
    System.setProperty("spring.config.name", "front-server")
    runApplication<WebFront>(*args)
}