package com.sneakercity.api.controller

import com.sneakercity.api.domain.Brand
import com.sneakercity.api.dto.BrandDto
import com.sneakercity.api.service.BrandService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
class BrandController(val brandService: BrandService) {

    @GetMapping(value = ["brands"])
    fun getBrands(pageable: Pageable): ResponseEntity<Page<Brand?>>{
        return ResponseEntity(brandService.getBrands(pageable), HttpStatus.OK)
    }

    @PostMapping(value = ["brands"])
    fun createBrand(@RequestBody brandDto: BrandDto): ResponseEntity<Brand>{
        return ResponseEntity(brandService.createBrand(brandDto), HttpStatus.CREATED)
    }

    @PutMapping(value = ["brands/{id}"])
    fun updateBrand(@PathVariable("id") id: UUID, @RequestBody brandDto: BrandDto): ResponseEntity<Brand>{
        return ResponseEntity(brandService.updateBrand(id, brandDto), HttpStatus.OK)
    }
}