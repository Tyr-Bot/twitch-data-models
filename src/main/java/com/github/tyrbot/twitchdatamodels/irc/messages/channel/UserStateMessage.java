package com.github.tyrbot.twitchdatamodels.irc.messages.channel;

import java.util.Map;

import com.github.tyrbot.twitchdatamodels.irc.IrcChannel;

public class UserStateMessage {
    
    public final IrcChannel ircChannel;
    public final Map<String, Integer> badgeInfo;
    public final Map<String, Integer> badges;
    public final String color;
    public final String displayName;
    public final boolean isModerator;
    public final boolean isSubscriber;
    public final boolean isBroadcaster;

    public UserStateMessage(IrcChannel ircChannel, Map<String, Integer> badgeInfo, Map<String, Integer> badges,
            String color, String displayName, boolean isModerator, boolean isSubscriber, boolean isBroadcaster) {
        this.ircChannel = ircChannel;
        this.badgeInfo = badgeInfo;
        this.badges = badges;
        this.color = color;
        this.displayName = displayName;
        this.isModerator = isModerator;
        this.isSubscriber = isSubscriber;
        this.isBroadcaster = isBroadcaster;
    }
}