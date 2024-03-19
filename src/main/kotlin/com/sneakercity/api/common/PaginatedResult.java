package com.sneakercity.api.common;

import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

public class PaginatedResult<T> implements Serializable {

    private long size;

    private long numberOfElements;

    private long totalPages;

    private long totalElements;

    private long number;

    private List<T> content;


    public PaginatedResult(List<T> list) {
        this.content = list;
    }

    public PaginatedResult(Page<T> page) {
        this.content = page.getContent();
        this.size = page.getSize();
        this.totalElements = page.getTotalElements();
        this.number = page.getNumber();
        this.totalPages = page.getTotalPages();
        this.numberOfElements = page.getNumberOfElements();
    }

    public void setPage(Page<T> page) {

        this.size = page.getSize();
        this.totalElements = page.getTotalElements();
        this.number = page.getNumber();
        this.totalPages = page.getTotalPages();
        this.numberOfElements = page.getNumberOfElements();

    }


}
