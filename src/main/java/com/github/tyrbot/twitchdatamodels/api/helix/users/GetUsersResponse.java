package com.github.tyrbot.twitchdatamodels.api.helix.users;

import com.github.tyrbot.twitchdatamodels.api.helix.ArrayResponse;

public class GetUsersResponse extends ArrayResponse<GetUsersResponseObject>{

    public GetUsersResponse(GetUsersResponseObject[] data) {
        super(data);
    }
}