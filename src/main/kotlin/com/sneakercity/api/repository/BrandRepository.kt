package com.sneakercity.api.repository

import com.sneakercity.api.domain.Brand
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface BrandRepository : CrudRepository<Brand?, UUID?> {
    fun findAll(pageable: Pageable): Page<Brand?>
}
