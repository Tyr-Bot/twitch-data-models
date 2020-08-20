package com.github.tyrbot.twitchdatamodels.irc.messages.channel;

import com.github.tyrbot.twitchdatamodels.irc.IrcChannel;

public class ClearMsgMessage {

    public final IrcChannel ircChannel;
    public final String userLogin;
    public final String targetMessageId;
    public final String targetMessageContent;

    public ClearMsgMessage(IrcChannel ircChannel, String userLogin, String targetMessageId,
            String targetMessageContent) {
        this.ircChannel = ircChannel;
        this.userLogin = userLogin;
        this.targetMessageId = targetMessageId;
        this.targetMessageContent = targetMessageContent;
    }
}