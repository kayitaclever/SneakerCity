package com.sneakercity.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController {
    @GetMapping(value = ["/products"])
    fun getProducts(): List<Map<String, Any>> {
        return listOf()
    }
}