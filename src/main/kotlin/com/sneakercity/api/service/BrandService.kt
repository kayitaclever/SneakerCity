package com.sneakercity.api.service

import com.sneakercity.api.domain.Brand
import com.sneakercity.api.dto.BrandDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.UUID

interface BrandService {
    fun getBrands(pageable: Pageable): Page<Brand?>

    fun createBrand(brandDto: BrandDto): Brand

    fun updateBrand(id: UUID, brandDto: BrandDto): Brand
}