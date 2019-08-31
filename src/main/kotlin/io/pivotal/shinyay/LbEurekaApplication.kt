package io.pivotal.shinyay

import io.pivotal.shinyay.domain.addition.runAdditionServer
import io.pivotal.shinyay.domain.subtraction.runSubtractionServer
import io.pivotal.shinyay.registration.EurekaServer
import io.pivotal.shinyay.registration.runEurekaServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//@SpringBootApplication
class LbEurekaApplication

fun main(args: Array<String>) {
	var serverName = ""

	when(args.size) {
		2 -> {
			System.setProperty("server.port", args[1])
			serverName = args[0].toLowerCase()
		}
		1 -> serverName = args[0].toLowerCase()
	}

	when(serverName) {
		"eureka" -> runEurekaServer(args)
		"addition" -> runAdditionServer(args)
		"subtraction" -> runSubtractionServer(args)
	}
}
