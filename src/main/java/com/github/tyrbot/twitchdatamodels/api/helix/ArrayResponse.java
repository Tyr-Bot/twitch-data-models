package com.github.tyrbot.twitchdatamodels.api.helix;

public class ArrayResponse<T> {
    
    public final T[] data;

    public ArrayResponse(T[] data) {
        this.data = data;
    }
}