package com.sneakercity.api.common

import java.io.Serializable
import java.time.LocalDateTime

class ApiResponse<T> : Serializable {
    private var status = false
    private var code: String? = null

    private val message: String? = null

    private var data: T? = null

    private val timestamp: LocalDateTime = LocalDateTime.now()

    constructor()

    constructor(code: String?, data: T) {
        this.code = code
        this.data = data
        this.status = true
    }
}
