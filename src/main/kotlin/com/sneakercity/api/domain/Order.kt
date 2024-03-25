package com.sneakercity.api.domain

import com.sneakercity.api.enums.OrderStatus
import com.sneakercity.api.enums.PaymentMethod
import com.sneakercity.api.util.coverters.AddressConverter
import com.sneakercity.api.util.coverters.OrderItemConverter
import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "orders")
class Order(

    @Column(name = "items")
    @Convert(converter = OrderItemConverter::class)
    var orderItems: List<OrderItem> = emptyList(),

    @Column(name = "address")
    @Convert(converter = AddressConverter::class)
    var address: Address? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_method")
    var paymentMethod: PaymentMethod? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    var status: OrderStatus? = OrderStatus.PENDING,
    id: UUID?,
    createdDate: LocalDateTime?,
    modifiedDate: LocalDateTime?,
    state: Boolean?,
    createdBy: UUID?
): BaseEntity(id, createdDate, modifiedDate, state, createdBy) {
    constructor() : this(id = null, createdDate = null, modifiedDate = null, state = true, createdBy = null)
}


