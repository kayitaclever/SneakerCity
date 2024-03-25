package com.sneakercity.api.util.coverters

import com.google.gson.Gson
import com.sneakercity.api.domain.OrderItem
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter(autoApply = true)
class OrderItemConverter : AttributeConverter<OrderItem, String> {

    override fun convertToDatabaseColumn(data: OrderItem?): String {
        val jsonString = Gson().toJson(data) // Example using Gson library
        return jsonString
    }

    override fun convertToEntityAttribute(data: String?): OrderItem {
        val domain = Gson().fromJson(data, OrderItem::class.java) // Example using Gson library
        return domain
    }
}