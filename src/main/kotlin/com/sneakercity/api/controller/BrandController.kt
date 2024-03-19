package com.sneakercity.api.controller

import com.sneakercity.api.common.PaginatedResult
import com.sneakercity.api.common.SneakersResponseEntity
import com.sneakercity.api.domain.Brand
import com.sneakercity.api.service.BrandService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BrandController(val brandService: BrandService) {

    @GetMapping(value = ["brands"])
    fun getBrands(pageable: Pageable): SneakersResponseEntity<PaginatedResult<Brand?>> {
        val data = brandService.getBrands(pageable)
        return SneakersResponseEntity("Brands found", data, HttpStatus.OK)
    }
}