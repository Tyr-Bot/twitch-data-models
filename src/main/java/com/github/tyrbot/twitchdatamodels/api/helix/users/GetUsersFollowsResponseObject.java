package com.github.tyrbot.twitchdatamodels.api.helix.users;

public class GetUsersFollowsResponseObject {

    private final String followedAt;
    private final String fromId;
    private final String fromName;
    private final String toId;
    private final String toName;

    public GetUsersFollowsResponseObject(String followedAt, String fromId, String fromName, String toId,
            String toName) {
        this.followedAt = followedAt;
        this.fromId = fromId;
        this.fromName = fromName;
        this.toId = toId;
        this.toName = toName;
    }

    /**
     * @return Date and time when the from_id user followed the to_id user.
     */
    public String getFollowedAt() {
        return followedAt;
    }

    /**
     * @return ID of the user following the to_id user.
     */
    public String getFromId() {
        return fromId;
    }

    /**
     * @return Display name corresponding to from_id.
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * @return ID of the user being followed by the from_id user.
     */
    public String getToId() {
        return toId;
    }

    /**
     * @return Display name corresponding to to_id.
     */
    public String getToName() {
        return toName;
    }
}