package com.sneakercity.api.service

import com.sneakercity.api.domain.Shoe
import com.sneakercity.api.dto.ShoeDto
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.UUID

interface ShoeService {
    fun getShoes(pageable: Pageable): Page<Shoe?>

    fun createShoe(shoeDto: ShoeDto): Shoe

    fun updateShoe(id: UUID, shoeDto: ShoeDto): Shoe

    fun getShoeById(id: UUID): Shoe
}