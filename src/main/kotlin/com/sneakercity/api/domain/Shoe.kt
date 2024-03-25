package com.sneakercity.api.domain

import com.sneakercity.api.util.coverters.VariationConverter
import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "shoes")
class Shoe(
        @ManyToOne
        @JoinColumn(name = "shoe_model")
        var model: ShoeModel? = null,
        @Column(name = "name")
        var name: String? = null,
        @Column(name = "variations")
        @Convert(converter = VariationConverter::class)
        var variations: List<Variation> = emptyList(),
        var image: String? = null,
        id: UUID?,
        createdDate: LocalDateTime?,
        modifiedDate: LocalDateTime?,
        state: Boolean?,
        createdBy: UUID?
) : BaseEntity(id, createdDate, modifiedDate, state, createdBy) {
        constructor() : this(id = null, createdDate = null, modifiedDate = null, state = true, createdBy = null)
}