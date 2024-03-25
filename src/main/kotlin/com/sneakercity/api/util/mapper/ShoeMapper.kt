package com.sneakercity.api.util.mapper

import com.sneakercity.api.domain.Shoe
import com.sneakercity.api.domain.ShoeModel
import com.sneakercity.api.dto.ShoeDto
import com.sneakercity.api.dto.ShoeModelDto
import com.sneakercity.api.repository.BrandRepository
import com.sneakercity.api.repository.ShoeModelRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service


@Service
class ShoeMapper(val shoeModelRepository: ShoeModelRepository): Mapper<ShoeDto, Shoe> {
    override fun fromEntity(entity: Shoe): ShoeDto = ShoeDto(
            entity.id,
            entity.name,
            entity.model!!.id,
            entity.image,
            entity.variations,
            entity.createdDate,
            entity.modifiedDate,
            entity.state,
            entity.createdBy
    )

    override fun toEntity(domain: ShoeDto): Shoe {
        val model = shoeModelRepository.findByIdOrNull(domain.model)
        return Shoe(
                id = domain.id,
                name = domain.name,
                model = model!!,
                variations = domain.variations,
                image = domain.image,
                createdDate = domain.createdDate,
                modifiedDate = domain.modifiedDate,
                state = domain.state,
                createdBy = domain.createdBy
        )
    }
}