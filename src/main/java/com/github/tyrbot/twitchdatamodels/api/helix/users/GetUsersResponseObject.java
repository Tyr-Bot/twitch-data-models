package com.github.tyrbot.twitchdatamodels.api.helix.users;

public class GetUsersResponseObject {

    /**
     * User’s broadcaster type: "partner", "affiliate", or "".
     */
    public final String broadcasterType;

    /**
     * User’s channel description.
     */
    public final String description;

    /**
     * User’s display name.
     */
    public final String displayName;

    /**
     * User’s email address. Returned if the request includes the user:read:email
     * scope.
     */
    public final String email;

    /**
     * User’s ID.
     */
    public final String id;

    /**
     * User’s login name.
     */
    public final String login;

    /**
     * URL of the user’s offline image.
     */
    public final String offlineImageUrl;

    /**
     * URL of the user’s profile image.
     */
    public final String profileImageUrl;

    /**
     * User’s type: "staff", "admin", "global_mod", or "".
     */
    public final String type;

    /**
     * Total number of views of the user’s channel.
     */
    public final int viewCount;

    public GetUsersResponseObject(final String broadcasterType, final String description, final String displayName,
            final String email, final String id, final String login, final String offlineImageUrl,
            final String profileImageUrl, final String type, final int viewCount) {
        this.broadcasterType = broadcasterType;
        this.description = description;
        this.displayName = displayName;
        this.email = email;
        this.id = id;
        this.login = login;
        this.offlineImageUrl = offlineImageUrl;
        this.profileImageUrl = profileImageUrl;
        this.type = type;
        this.viewCount = viewCount;
    }
}