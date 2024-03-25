package com.sneakercity.api.domain

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

data class OrderItem(
    var shoe: Shoe? = null,
    var quantity: Int? = null,
    var variation: Variation? = null,
    var totalPrice: Double = quantity!! * variation!!.price,
)