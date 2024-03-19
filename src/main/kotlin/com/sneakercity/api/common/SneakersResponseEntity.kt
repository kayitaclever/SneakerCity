package com.sneakercity.api.common

import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import java.io.Serializable

class SneakersResponseEntity<T>(code: String?, data: T, status: HttpStatusCode?) : ResponseEntity<ApiResponse<T>?>(ApiResponse(code, data), status!!), Serializable
