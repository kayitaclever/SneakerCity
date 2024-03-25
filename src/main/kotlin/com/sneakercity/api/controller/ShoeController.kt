package com.sneakercity.api.controller

import com.sneakercity.api.domain.Shoe
import com.sneakercity.api.dto.ShoeDto
import com.sneakercity.api.service.ShoeService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class ShoeController(val shoeService: ShoeService) {
    @GetMapping(value = ["products"])
    fun getShoes(pageable: Pageable): ResponseEntity<Page<Shoe?>> {
        return ResponseEntity(shoeService.getShoes(pageable), HttpStatus.OK)
    }

    @GetMapping(value = ["products/{id}"])
    fun getProductById(@PathVariable("id") id: UUID): ResponseEntity<Shoe> {
        return ResponseEntity(shoeService.getShoeById(id), HttpStatus.OK)
    }

    @PostMapping(value = ["products"])
    fun createProduct(@RequestBody shoeDto: ShoeDto): ResponseEntity<Shoe>{
        return ResponseEntity(shoeService.createShoe(shoeDto), HttpStatus.CREATED)
    }

    @PutMapping(value = ["products/{id}"])
    fun updateProduct(@PathVariable("id") id: UUID, @RequestBody shoeDto: ShoeDto): ResponseEntity<Shoe>{
        return ResponseEntity(shoeService.updateShoe(id, shoeDto), HttpStatus.OK)
    }
}