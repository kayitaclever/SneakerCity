package com.sneakercity.api.service.impl

import com.sneakercity.api.domain.Shoe
import com.sneakercity.api.dto.ShoeDto
import com.sneakercity.api.repository.ShoeRepository
import com.sneakercity.api.service.ShoeService
import com.sneakercity.api.util.mapper.ShoeMapper
import com.sneakercity.api.util.mapper.ShoeModelMapper
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ShoeServiceImpl(val shoeRepository: ShoeRepository, val shoeMapper: ShoeMapper): ShoeService {
    override fun getShoes(pageable: Pageable): Page<Shoe?> {
        return shoeRepository.findAll(pageable)
    }

    override fun createShoe(shoeDto: ShoeDto): Shoe {
        return shoeRepository.save(shoeMapper.toEntity(shoeDto))
    }

    override fun updateShoe(id: UUID, shoeDto: ShoeDto): Shoe {
        shoeRepository.findById(id).orElseThrow { ChangeSetPersister.NotFoundException() }
        return shoeRepository.save(shoeMapper.toEntity(shoeDto))
    }

    override fun getShoeById(id: UUID): Shoe {
        return shoeRepository.findById(id).orElseThrow { ChangeSetPersister.NotFoundException() }!!
    }
}