package com.github.tyrbot.twitchdatamodels.api.helix;

public class Pagination {

    public final String cursor;

    protected Pagination(String cursor) {
        this.cursor = cursor;
    }
}