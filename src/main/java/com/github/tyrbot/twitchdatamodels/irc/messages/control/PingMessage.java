package com.github.tyrbot.twitchdatamodels.irc.messages.control;

import com.github.tyrbot.twitchdatamodels.irc.messages.IrcMessage;

public class PingMessage implements IrcMessage {
    
    public final String pingMessageString;

    public PingMessage(String pingMessageString) {
        this.pingMessageString = pingMessageString;
    }
}