package com.sneakercity.api.dto

import java.time.LocalDateTime
import java.util.*

data class BrandDto(
        var id: UUID?,

        var name: String?,

        var slogan: String?,

        var createdDate: LocalDateTime?,

        var modifiedDate: LocalDateTime?,

        var state: Boolean?,

        var createdBy: UUID?,
) {

}
