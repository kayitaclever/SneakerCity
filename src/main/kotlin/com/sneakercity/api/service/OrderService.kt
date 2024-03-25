package com.sneakercity.api.service

import com.sneakercity.api.domain.Order
import com.sneakercity.api.enums.OrderStatus
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.UUID

interface OrderService {

    fun getOrders(pageable: Pageable): Page<Order?>

    fun createOrder(order: Order): Order

    fun updateOrderStatus(id: UUID, status: OrderStatus): Order


}