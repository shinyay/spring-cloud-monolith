package io.pivotal.shinyay.domain.addition

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class AdditionController {

    val logger: Logger = LoggerFactory.getLogger(this.javaClass.name)

    @RequestMapping("/")
    fun root() = "index"

    @RequestMapping("/add")
    @ResponseBody
    fun add(@RequestParam(defaultValue = "0") param1: String,
            @RequestParam(defaultValue = "0") param2: String): String {
        val add1 = param1.toInt()
        val add2 = param2.toInt()
        val sum = add1 + add2
        return "{\"add1\":\"$add1\", \"add2\":\"$add2\", \"sum\": \"$sum\"}"
    }
}