package com.sneakercity.api.repository

import com.sneakercity.api.domain.ShoeModel
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ShoeModelRepository : CrudRepository<ShoeModel?, UUID?> {
    fun findAll(pageable: Pageable): Page<ShoeModel?>
}