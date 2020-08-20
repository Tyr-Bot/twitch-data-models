package com.github.tyrbot.twitchdatamodels.irc.messages.channel;

import com.github.tyrbot.twitchdatamodels.irc.IrcChannel;

public class UserPartMessage {
    
    public final IrcChannel ircChannel;
    public final String userLogin;

    public UserPartMessage(IrcChannel ircChannel, String userLogin) {
        this.ircChannel = ircChannel;
        this.userLogin = userLogin;
    }
}