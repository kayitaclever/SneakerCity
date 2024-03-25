package com.sneakercity.api.domain

import jakarta.persistence.Column

data class Address(
    val firstName: String,

    val lastName: String,

    val phoneNumber: String,

    val emailAddress: String?,

    val addressLine1: String,

    val addressLine2: String?, // Optional second address line

    val city: String,

    val country: String
)

