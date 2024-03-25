package com.sneakercity.api.dto

import com.sneakercity.api.domain.Variation
import java.time.LocalDateTime
import java.util.*

data class ShoeDto (

        var id: UUID?,

        var name: String?,

        var model: UUID?,

        var image: String?,

        var variations: List<Variation>,
        var createdDate: LocalDateTime?,

        var modifiedDate: LocalDateTime?,

        var state: Boolean?,

        var createdBy: UUID?,
)