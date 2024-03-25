package com.sneakercity.api.service.impl

import com.sneakercity.api.domain.Order
import com.sneakercity.api.enums.OrderStatus
import com.sneakercity.api.repository.OrderRepository
import com.sneakercity.api.service.OrderService
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service
class OrderServiceImpl(val orderRepository: OrderRepository) : OrderService {
    override fun getOrders(pageable: Pageable): Page<Order?> {
        return orderRepository.findAll(pageable)
    }

    override fun createOrder(order: Order): Order {
        return orderRepository.save(order)
    }

    override fun updateOrderStatus(id: UUID, status: OrderStatus): Order {
        val order = orderRepository.findById(id).orElseThrow { ChangeSetPersister.NotFoundException() }!!
        order.status = status
        return orderRepository.save(order)
    }
}