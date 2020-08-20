package com.github.tyrbot.twitchdatamodels.irc.messages.channel;

import java.util.Map;
import java.util.Set;

import com.github.tyrbot.twitchdatamodels.irc.IrcChannel;

public class PrivMsgMessage {
    
    public final IrcChannel ircChannel;
    public final Map<String, Integer> badgeInfo;
    public final Map<String, Integer> badges;
    public final String color;
    public final String displayName;
    public final boolean isModerator;
    public final boolean isSubscriber;
    public final boolean isBroadcaster;
    public final String userId;
    public final String roomId;
    public final long timeMessageSent;
    public final String messageId;
    public final Map<Integer, Set<int[]>> emotes;
    public final String message;

    public PrivMsgMessage(IrcChannel ircChannel, Map<String, Integer> badgeInfo, Map<String, Integer> badges,
            String color, String displayName, boolean isModerator, boolean isSubscriber, boolean isBroadcaster,
            String userId, String roomId, long timeMessageSent, String messageId, Map<Integer, Set<int[]>> emotes,
            String message) {
        this.ircChannel = ircChannel;
        this.badgeInfo = badgeInfo;
        this.badges = badges;
        this.color = color;
        this.displayName = displayName;
        this.isModerator = isModerator;
        this.isSubscriber = isSubscriber;
        this.isBroadcaster = isBroadcaster;
        this.userId = userId;
        this.roomId = roomId;
        this.timeMessageSent = timeMessageSent;
        this.messageId = messageId;
        this.emotes = emotes;
        this.message = message;
    }
    
}