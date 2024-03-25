package com.sneakercity.api.dto

import java.time.LocalDateTime
import java.util.*

data class ShoeModelDto(
        var id: UUID?,

        var name: String?,

        var description: String?,

        var brand: UUID?,

        var createdDate: LocalDateTime?,

        var modifiedDate: LocalDateTime?,

        var state: Boolean?,

        var createdBy: UUID?,
)
