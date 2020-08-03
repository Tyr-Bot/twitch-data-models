package com.github.tyrbot.twitchdatamodels.api.helix;

public class Pagination {

    private final String cursor;

    protected Pagination(String cursor) {
        this.cursor = cursor;
    }

    public String getCursor() {
        return cursor;
    }

}