package com.github.tyrbot.twitchdatamodels.api.helix;

public class PaginatedResponse<T> {
    
    private final int total;
    private final T[] data;
    private final Pagination pagination;

    public PaginatedResponse(Integer total, T[] data, Pagination pagination) {
        this.total = total == null ? data.length : total;
        this.data = data;
        this.pagination = pagination;
    }

    public int getTotal() {
        return total;
    }
    
    public T[] getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }
}