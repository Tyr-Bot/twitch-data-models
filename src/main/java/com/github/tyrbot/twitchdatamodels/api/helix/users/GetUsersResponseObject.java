package com.github.tyrbot.twitchdatamodels.api.helix.users;

public class GetUsersResponseObject {

    private final String broadcasterType;
    private final String description;
    private final String displayName;
    private final String email;
    private final String id;
    private final String login;
    private final String offlineImageUrl;
    private final String profileImageUrl;
    private final String type;
    private final int viewCount;

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

    /**
     * @return User’s broadcaster type: "partner", "affiliate", or "".
     */
    public String getBroadcasterType() {
        return broadcasterType;
    }

    /**
     * @return User’s channel description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return User’s display name.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @return User’s email address. Returned if the request includes the
     *         user:read:email scope.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return User’s ID.
     */
    public String getId() {
        return id;
    }

    /**
     * @return User’s login name.
     */
    public String getLogin() {
        return login;
    }

    /**
     * @return URL of the user’s offline image.
     */
    public String getOfflineImageUrl() {
        return offlineImageUrl;
    }

    /**
     * @return URL of the user’s profile image.
     */
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     * @return User’s type: "staff", "admin", "global_mod", or "".
     */
    public String getType() {
        return type;
    }

    /**
     * @return Total number of views of the user’s channel.
     */
    public int getViewCount() {
        return viewCount;
    }
}