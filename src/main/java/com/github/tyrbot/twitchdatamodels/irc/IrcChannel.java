package com.github.tyrbot.twitchdatamodels.irc;

public class IrcChannel {
    
    private final String channelReference;

    public IrcChannel(String channelReference) {
        this.channelReference = channelReference;
    }

    public String getChannelReference() {
        return channelReference;
    }

    public String getChannelName() {
        return channelReference.substring(1);
    }
}