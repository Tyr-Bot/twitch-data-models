package com.github.tyrbot.twitchdatamodels.api.helix;

public class PaginatedResponse<T> {
    
    public final int total;
    public final T[] data;
    public final Pagination pagination;

    public PaginatedResponse(Integer total, T[] data, Pagination pagination) {
        this.total = total == null ? data.length : total;
        this.data = data;
        this.pagination = pagination;
    }
}