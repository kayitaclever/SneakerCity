package com.sneakercity.api.service

import com.sneakercity.api.common.PaginatedResult
import com.sneakercity.api.domain.Brand
import com.sneakercity.api.pojo.BrandPojo
import org.springframework.data.domain.Pageable

interface BrandService {
    fun getBrands(pageable: Pageable): PaginatedResult<BrandPojo>
}