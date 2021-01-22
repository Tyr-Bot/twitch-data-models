package com.github.tyrbot.twitchdatamodels.irc.messages.channel;

import com.github.tyrbot.twitchdatamodels.irc.IrcChannel;
import com.github.tyrbot.twitchdatamodels.irc.messages.IrcMessage;

public class RoomStateMessage implements IrcMessage {
    
    public final IrcChannel ircChannel;
    public final String roomId;
    public final int slowModeTime;
    public final int neededFollowTime;
    public final boolean isSubsOnly;
    public final boolean isEmoteOnly;
    public final boolean hasRitualsEnabled;
    public final boolean hasR9kModeEnabled;

    public RoomStateMessage(IrcChannel ircChannel, String roomId, int slowModeTime, int neededFollowTime,
            boolean isSubsOnly, boolean isEmoteOnly, boolean hasRitualsEnabled, boolean hasR9kModeEnabled) {
        this.ircChannel = ircChannel;
        this.roomId = roomId;
        this.slowModeTime = slowModeTime;
        this.neededFollowTime = neededFollowTime;
        this.isSubsOnly = isSubsOnly;
        this.isEmoteOnly = isEmoteOnly;
        this.hasRitualsEnabled = hasRitualsEnabled;
        this.hasR9kModeEnabled = hasR9kModeEnabled;
    }

    public boolean hasSlowModeEnabled() {
        return slowModeTime > 0;
    }

    public boolean isFollowersOnly() {
        return neededFollowTime != -1;
    }
}