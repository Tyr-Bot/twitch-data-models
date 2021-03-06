package com.github.tyrbot.twitchdatamodels.irc.messages.channel;

import com.github.tyrbot.twitchdatamodels.irc.IrcChannel;
import com.github.tyrbot.twitchdatamodels.irc.messages.IrcMessage;

public class UserPartMessage implements IrcMessage {
    
    public final IrcChannel ircChannel;
    public final String userLogin;

    public UserPartMessage(IrcChannel ircChannel, String userLogin) {
        this.ircChannel = ircChannel;
        this.userLogin = userLogin;
    }
}