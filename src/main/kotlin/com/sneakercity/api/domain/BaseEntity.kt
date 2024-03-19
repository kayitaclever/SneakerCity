package com.sneakercity.api.domain

import jakarta.persistence.Column
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.GeneratedValue
import java.time.LocalDateTime
import java.util.*

@MappedSuperclass
abstract class BaseEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: UUID?,
        val createdDate: LocalDateTime?,
        val modifiedDate: LocalDateTime?,
        val state: Boolean?,
        @Column(name = "created_by")
        val createdBy: UUID?
)
