package io.pivotal.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LbEurekaApplication

fun main(args: Array<String>) {
	runApplication<LbEurekaApplication>(*args)
}
