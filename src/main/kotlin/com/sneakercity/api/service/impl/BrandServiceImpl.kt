package com.sneakercity.api.service.impl

import com.sneakercity.api.common.PaginatedResult
import com.sneakercity.api.domain.Brand
import com.sneakercity.api.pojo.BrandPojo
import com.sneakercity.api.repository.BrandRepository
import com.sneakercity.api.service.BrandService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class BrandServiceImpl(val brandRepository: BrandRepository) : BrandService {
    override fun getBrands(pageable: Pageable): PaginatedResult<BrandPojo> {
        val page = brandRepository.findAll(pageable)
        return mapToBrandPojo(page)
    }

    fun mapToBrandPojo(page: Page<Brand?>): PaginatedResult<BrandPojo> {


        val response = PaginatedResult(page.content.map { item -> BrandPojo(item) })
        response.setPage(page)


        return response
    }
}