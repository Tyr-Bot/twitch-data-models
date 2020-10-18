package com.github.tyrbot.twitchdatamodels.api.helix.users;

public class GetUsersFollowsResponseObject {

    /**
     * Date and time when the from_id user followed the to_id user.
     */
    public final String followedAt;

    /**
     * ID of the user following the to_id user.
     */
    public final String fromId;

    /**
     * Display name corresponding to from_id.
     */
    public final String fromName;

    /**
     * ID of the user being followed by the from_id user.
     */
    public final String toId;

    /**
     * Display name corresponding to to_id.
     */
    public final String toName;

    public GetUsersFollowsResponseObject(String followedAt, String fromId, String fromName, String toId,
            String toName) {
        this.followedAt = followedAt;
        this.fromId = fromId;
        this.fromName = fromName;
        this.toId = toId;
        this.toName = toName;
    }
}