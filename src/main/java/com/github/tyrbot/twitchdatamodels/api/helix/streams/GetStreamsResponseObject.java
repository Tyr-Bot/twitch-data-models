package com.github.tyrbot.twitchdatamodels.api.helix.streams;

public class GetStreamsResponseObject {

    /**
     * ID of the game being played on the stream.
     */
    public final String gameId;

    /**
     * Stream ID.
     */
    public final String id;

    /**
     * Stream language.
     */
    public final String language;

    /**
     * UTC timestamp.
     */
    public final String startedAt;

    /**
     * Shows tag IDs that apply to the stream.
     */
    public final String[] tagIds;

    /**
     * Thumbnail URL of the stream. All image URLs have variable width and height.
     * You can replace {width} and {height} with any values to get that size image
     */
    public final String thumbnailUrl;

    /**
     * Stream title.
     */
    public final String title;

    /**
     * Stream type: "live" or "" (in case of error).
     */
    public final String type;

    /**
     * ID of the user who is streaming.
     */
    public final String userId;

    /**
     * Display name corresponding to user_id.
     */
    public final String userName;

    /**
     * Number of viewers watching the stream at the time of the query.
     */
    public final int viewerCount;

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
}
