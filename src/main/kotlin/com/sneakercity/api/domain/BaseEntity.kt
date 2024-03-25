package com.sneakercity.api.domain

import jakarta.persistence.Column
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.GeneratedValue
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime
import java.util.*

@MappedSuperclass
abstract class BaseEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: UUID?,
        @CreatedDate
        val createdDate: LocalDateTime?,
        @LastModifiedDate
        val modifiedDate: LocalDateTime?,
        val state: Boolean?,
        @Column(name = "created_by")
        val createdBy: UUID?
)
