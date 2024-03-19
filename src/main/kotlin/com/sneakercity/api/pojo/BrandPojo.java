package com.sneakercity.api.pojo;

import com.sneakercity.api.domain.Brand;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BrandPojo {
    private UUID id;

    private String name;

    private String slogan;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;

    private boolean state;

    private UUID createdBy;

    public BrandPojo(Brand brand) {
        this.id = brand.getId();
        this.name = brand.getName();
        this.slogan = brand.getSlogan();
        this.createdDate = brand.getCreatedDate();
        this.modifiedDate = brand.getModifiedDate();
        this.state = Boolean.TRUE.equals(brand.getState());
        this.createdBy = brand.getCreatedBy();

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public UUID getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UUID createdBy) {
        this.createdBy = createdBy;
    }
}
