package com.github.tyrbot.twitchdatamodels.api.helix.users;

import com.github.tyrbot.twitchdatamodels.api.helix.PaginatedResponse;
import com.github.tyrbot.twitchdatamodels.api.helix.Pagination;

public class GetUsersFollowsResponse extends PaginatedResponse<GetUsersFollowsResponseObject> {

    public GetUsersFollowsResponse(Integer total, GetUsersFollowsResponseObject[] data, Pagination pagination) {
        super(total, data, pagination);
    }
}