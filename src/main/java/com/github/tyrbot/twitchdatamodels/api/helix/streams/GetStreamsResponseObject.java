package com.github.tyrbot.twitchdatamodels.api.helix.streams;

public class GetStreamsResponseObject {

    private final String gameId;
    private final String id;
    private final String language;
    private final String startedAt;
    private final String[] tagIds;
    private final String thumbnailUrl;
    private final String title;
    private final String type;
    private final String userId;
    private final String userName;
    private final int viewerCount;

    public GetStreamsResponseObject(final String gameId, final String id, final String language, final String startedAt,
            final String[] tagIds, final String thumbnailUrl, final String title, final String type,
            final String userId, final String userName, final int viewerCount) {
        this.gameId = gameId;
        this.id = id;
        this.language = language;
        this.startedAt = startedAt;
        this.tagIds = tagIds;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
        this.type = type;
        this.userId = userId;
        this.userName = userName;
        this.viewerCount = viewerCount;
    }

    /**
     * @return ID of the game being played on the stream.
     */
    public String getGameId() {
        return gameId;
    }

    /**
     * @return Stream ID.
     */
    public String getId() {
        return id;
    }

    /**
     * @return Stream language.
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @return UTC timestamp.
     */
    public String getStartedAt() {
        return startedAt;
    }

    /**
     * @return Shows tag IDs that apply to the stream.
     */
    public String[] getTagIds() {
        return tagIds;
    }

    /**
     * @return Thumbnail URL of the stream. All image URLs have variable width and height. You can replace {width} and {height} with any values to get that size image
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * @return Stream title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return Stream type: "live" or "" (in case of error).
     */
    public String getType() {
        return type;
    }

    /**
     * @return ID of the user who is streaming.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return Display name corresponding to user_id.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return Number of viewers watching the stream at the time of the query.
     */
    public int getViewerCount() {
        return viewerCount;
    }
}
