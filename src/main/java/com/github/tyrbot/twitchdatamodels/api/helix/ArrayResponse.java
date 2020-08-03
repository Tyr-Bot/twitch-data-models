package com.github.tyrbot.twitchdatamodels.api.helix;

public class ArrayResponse<T> {
    
    private final T[] data;

    public ArrayResponse(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }
}