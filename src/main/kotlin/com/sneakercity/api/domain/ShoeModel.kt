package com.sneakercity.api.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "shoe_models") // Optional table name specification
class ShoeModel(
        id: UUID?,
        createdDate: LocalDateTime?,
        modifiedDate: LocalDateTime?,
        state: Boolean?,
        createdBy: UUID?
) : BaseEntity(id, createdDate, modifiedDate, state, createdBy) {
    @Column(name = "name", nullable = false)
    var name: String? = null

    // Additional constructors or methods can be added here
    @Column(name = "description")
    var description: String? = null

    @ManyToOne
    @JoinColumn(name = "brand")
    var brand: Brand? = null
}
