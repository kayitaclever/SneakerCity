package com.sneakercity.api.util.coverters

import com.google.gson.Gson
import com.sneakercity.api.domain.Address
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter


@Converter(autoApply = true)
class AddressConverter : AttributeConverter<Address, String> {

    override fun convertToDatabaseColumn(data: Address?): String {
        val jsonString = Gson().toJson(data) // Example using Gson library
        return jsonString
    }

    override fun convertToEntityAttribute(data: String?): Address {
        val domain = Gson().fromJson(data, Address::class.java) // Example using Gson library
        return domain
    }
}
