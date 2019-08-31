package io.pivotal.shinyay.domain.subtraction

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class SubtractionController {

    val logger: Logger = LoggerFactory.getLogger(this.javaClass.name)

    @RequestMapping("/")
    fun index() = "index"

    @RequestMapping("/sub")
    @ResponseBody
    fun sub(@RequestParam(defaultValue = "0") param1: String,
            @RequestParam(defaultValue = "0") param2: String): String {
        val sub1 = param1.toInt()
        val sub2 = param2.toInt()
        val diff = sub1 - sub2
        return "{\"sub1\":\"$sub1\", \"sub2\":\"$sub2\", \"diff\": \"$diff\"}"
    }
}