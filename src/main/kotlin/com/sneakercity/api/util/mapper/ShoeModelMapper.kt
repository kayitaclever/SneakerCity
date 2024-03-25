package com.sneakercity.api.util.mapper

import com.sneakercity.api.domain.Brand
import com.sneakercity.api.domain.ShoeModel
import com.sneakercity.api.dto.BrandDto
import com.sneakercity.api.dto.ShoeModelDto
import com.sneakercity.api.repository.BrandRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ShoeModelMapper(val brandRepository: BrandRepository): Mapper<ShoeModelDto, ShoeModel> {
    override fun fromEntity(entity: ShoeModel): ShoeModelDto = ShoeModelDto(
            entity.id,
            entity.name,
            entity.description,
            entity.brand?.id,
            entity.createdDate,
            entity.modifiedDate,
            entity.state,
            entity.createdBy
    )

    override fun toEntity(domain: ShoeModelDto): ShoeModel {
        val brand = brandRepository.findByIdOrNull(domain.brand)
        return ShoeModel(id = domain.id, name = domain.name, description = domain.description, brand = brand, createdDate = domain.createdDate, modifiedDate = domain.modifiedDate, state = domain.state, createdBy = domain.createdBy)
    }
}