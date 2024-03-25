package com.sneakercity.api.domain

data class Variation(
        val sizes: List<Double>,
        val colors: List<String>,
        val material: String,
        val price: Double,
        val stock: Int,
        val images: List<String>,
)