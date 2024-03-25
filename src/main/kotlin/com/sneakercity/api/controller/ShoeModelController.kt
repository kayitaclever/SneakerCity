package com.sneakercity.api.controller

import com.sneakercity.api.domain.ShoeModel
import com.sneakercity.api.dto.ShoeModelDto
import com.sneakercity.api.service.ShoeModelService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
class ShoeModelController(val shoeModelService: ShoeModelService) {

    @GetMapping(value = ["models"])
    fun getModels(pageable: Pageable): ResponseEntity<Page<ShoeModel?>> {
        return ResponseEntity(shoeModelService.getModels(pageable), HttpStatus.OK)
    }

    @PostMapping(value = ["models"])
    fun createModel(@RequestBody modelDto: ShoeModelDto): ResponseEntity<ShoeModel>{
        return ResponseEntity(shoeModelService.createModel(modelDto), HttpStatus.CREATED)
    }

    @PutMapping(value = ["models/{id}"])
    fun updateModel(@PathVariable("id") id: UUID, @RequestBody modelDto: ShoeModelDto): ResponseEntity<ShoeModel>{
        return ResponseEntity(shoeModelService.updateModel(id, modelDto), HttpStatus.OK)
    }
}