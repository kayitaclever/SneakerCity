package com.sneakercity.api.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "brands")
class Brand(
        @Column(name = "name", nullable = false)
        var name: String? = null,
        @Column(name = "slogan")
        var slogan: String? = null,
        id: UUID?,
        createdDate: LocalDateTime?,
        modifiedDate: LocalDateTime?,
        state: Boolean?,
        createdBy: UUID?) : BaseEntity(id, createdDate, modifiedDate, state, createdBy) {
        constructor() : this(id = null, createdDate = null, modifiedDate = null, state = true, createdBy = null)

}
