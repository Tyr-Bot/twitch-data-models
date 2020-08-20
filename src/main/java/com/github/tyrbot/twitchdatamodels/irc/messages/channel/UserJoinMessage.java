package com.github.tyrbot.twitchdatamodels.irc.messages.channel;

import com.github.tyrbot.twitchdatamodels.irc.IrcChannel;

public class UserJoinMessage {

    public final IrcChannel ircChannel;
    public final String userLogin;

    public UserJoinMessage(IrcChannel ircChannel, String userLogin) {
        this.ircChannel = ircChannel;
        this.userLogin = userLogin;
    }
}