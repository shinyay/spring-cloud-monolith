package io.pivotal.shinyay.loadbalancer.controller

import io.pivotal.shinyay.domain.subtraction.SubtractionServer
import io.pivotal.shinyay.loadbalancer.service.WebAdditionService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class WebCountController(val webAdditionService: WebAdditionService) {

    val logger: Logger = LoggerFactory.getLogger(this.javaClass.name)

    @RequestMapping("/add")
    fun add(@RequestParam(defaultValue = "0") param1: String,
            @RequestParam(defaultValue = "0") param2: String,
            model: Model): String {

        val sum = webAdditionService.add(param1, param2)
        logger.info("SUM: $sum")
        model.addAttribute("json", sum)
        return "sum"
    }
}