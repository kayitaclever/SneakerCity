package com.sneakercity.api.repository

import com.sneakercity.api.domain.Brand
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface BrandRepository : JpaRepository<Brand?, UUID?>
