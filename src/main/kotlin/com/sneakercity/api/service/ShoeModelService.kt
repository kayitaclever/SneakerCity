package com.sneakercity.api.service

import com.sneakercity.api.domain.ShoeModel
import com.sneakercity.api.dto.ShoeModelDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.UUID

interface ShoeModelService {
    fun getModels(pageable: Pageable): Page<ShoeModel?>

    fun createModel(modelDto: ShoeModelDto): ShoeModel

    fun updateModel(id: UUID, modelDto: ShoeModelDto): ShoeModel
}