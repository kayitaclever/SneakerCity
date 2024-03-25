package com.sneakercity.api.controller

import com.sneakercity.api.domain.Order
import com.sneakercity.api.domain.Shoe
import com.sneakercity.api.dto.OrderStatusDto
import com.sneakercity.api.service.OrderService
import com.sneakercity.api.service.ShoeService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.UUID


@RestController
class OrderController(val orderService: OrderService) {
    @GetMapping(value = ["orders"])
    fun getOrders(pageable: Pageable): ResponseEntity<Page<Order?>> {
        return ResponseEntity(orderService.getOrders(pageable), HttpStatus.OK)
    }

    @PostMapping(value = ["orders"])
    fun createOrder(@RequestBody order: Order): ResponseEntity<Order> {
        return ResponseEntity(orderService.createOrder(order), HttpStatus.CREATED)
    }

    @PutMapping(value = ["orders/{id}"])
    fun updateOrderStatus(@PathVariable("id") id: UUID, @RequestBody dto: OrderStatusDto): ResponseEntity<Order>{
        return ResponseEntity(orderService.updateOrderStatus(id, dto.status), HttpStatus.OK)
    }
}