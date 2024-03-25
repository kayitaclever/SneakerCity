package com.sneakercity.api.service.impl

import com.sneakercity.api.domain.ShoeModel
import com.sneakercity.api.dto.ShoeModelDto
import com.sneakercity.api.repository.ShoeModelRepository
import com.sneakercity.api.service.ShoeModelService
import com.sneakercity.api.util.mapper.ShoeModelMapper
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ShoeModelServiceImpl(val shoeModelRepository: ShoeModelRepository, val shoeModelMapper: ShoeModelMapper) : ShoeModelService {
    override fun getModels(pageable: Pageable): Page<ShoeModel?> {
        return shoeModelRepository.findAll(pageable)
    }

    override fun createModel(modelDto: ShoeModelDto): ShoeModel {
        return shoeModelRepository.save(shoeModelMapper.toEntity(modelDto))
    }

    override fun updateModel(id: UUID, modelDto: ShoeModelDto): ShoeModel {
        shoeModelRepository.findById(id).orElseThrow { ChangeSetPersister.NotFoundException() }
        return shoeModelRepository.save(shoeModelMapper.toEntity(modelDto))
    }
}