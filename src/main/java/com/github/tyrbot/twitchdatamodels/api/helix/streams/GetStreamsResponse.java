package com.github.tyrbot.twitchdatamodels.api.helix.streams;

import javax.annotation.Nullable;

import com.github.tyrbot.twitchdatamodels.api.helix.PaginatedResponse;
import com.github.tyrbot.twitchdatamodels.api.helix.Pagination;

public class GetStreamsResponse extends PaginatedResponse<GetStreamsResponseObject> {

    public GetStreamsResponse(@Nullable Integer total, GetStreamsResponseObject[] data, Pagination pagination) {
        super(total, data, pagination);
    }
}