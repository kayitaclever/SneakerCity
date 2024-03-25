package com.sneakercity.api.util.mapper

import com.sneakercity.api.domain.Brand
import com.sneakercity.api.dto.BrandDto
import org.springframework.stereotype.Service

@Service
class BrandMapper: Mapper<BrandDto, Brand> {

    override fun fromEntity(entity: Brand): BrandDto = BrandDto(
            entity.id,
            entity.name,
            entity.slogan,
            entity.createdDate,
            entity.modifiedDate,
            entity.state,
            entity.createdBy
    )

    override fun toEntity(domain: BrandDto): Brand = Brand(id = domain.id, name = domain.name, slogan = domain.slogan, createdDate = domain.createdDate, modifiedDate = domain.modifiedDate, state = domain.state, createdBy = domain.createdBy)
}