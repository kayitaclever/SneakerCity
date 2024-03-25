package com.sneakercity.api.repository

import com.sneakercity.api.domain.Shoe
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ShoeRepository : CrudRepository<Shoe?, UUID?> {
    fun findAll(pageable: Pageable): Page<Shoe?>
}
