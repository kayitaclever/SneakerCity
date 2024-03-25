package com.sneakercity.api.service.impl

import com.sneakercity.api.domain.Brand
import com.sneakercity.api.dto.BrandDto
import com.sneakercity.api.repository.BrandRepository
import com.sneakercity.api.service.BrandService
import com.sneakercity.api.util.mapper.BrandMapper
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class BrandServiceImpl(val brandRepository: BrandRepository, val brandMapper: BrandMapper) : BrandService {
    override fun getBrands(pageable: Pageable): Page<Brand?> {
        return brandRepository.findAll(pageable)
    }

    override fun createBrand(brandDto: BrandDto): Brand {
        return brandRepository.save(brandMapper.toEntity(brandDto))
    }

    override fun updateBrand(id: UUID, brandDto: BrandDto): Brand {
        brandRepository.findById(id).orElseThrow { NotFoundException() }
        return brandRepository.save(brandMapper.toEntity(brandDto))
    }

}