package com.github.tyrbot.twitchdatamodels.irc.messages.channel;

import java.util.Optional;

import com.github.tyrbot.twitchdatamodels.irc.IrcChannel;
import com.github.tyrbot.twitchdatamodels.irc.messages.IrcMessage;

public class ClearChatMessage implements IrcMessage {

    public final IrcChannel ircChannel;
    public final String userLogin;
    public final Optional<Integer> banDuration;

    public ClearChatMessage(IrcChannel ircChannel, String userLogin, Optional<Integer> banDuration) {
        this.ircChannel = ircChannel;
        this.userLogin = userLogin;
        this.banDuration = banDuration;
    }
    
    public boolean isPermanentBan() {
        return banDuration.isEmpty();
    }
}