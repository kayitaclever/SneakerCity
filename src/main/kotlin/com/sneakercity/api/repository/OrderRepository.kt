package com.sneakercity.api.repository

import com.sneakercity.api.domain.Order
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface OrderRepository : JpaRepository<Order, UUID> {

    fun findAllByCreatedBy(createdBy: UUID, pageable: Pageable): Page<Order?>
}