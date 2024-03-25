package com.sneakercity.api.util.coverters

import com.google.gson.Gson
import com.sneakercity.api.domain.Variation
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter(autoApply = true)
class VariationConverter : AttributeConverter<Variation, String> {

    override fun convertToDatabaseColumn(variation: Variation?): String {
        val jsonString = Gson().toJson(variation) // Example using Gson library
        return jsonString
    }

    override fun convertToEntityAttribute(data: String?): Variation {
        val variation = Gson().fromJson(data, Variation::class.java) // Example using Gson library
        return variation
    }
}
