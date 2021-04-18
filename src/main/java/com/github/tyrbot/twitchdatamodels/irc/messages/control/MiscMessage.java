package com.github.tyrbot.twitchdatamodels.irc.messages.control;

import com.github.tyrbot.twitchdatamodels.irc.messages.IrcMessage;

public class MiscMessage implements IrcMessage{
    
    public final String miscMessageString;

    public MiscMessage(String miscMessageString) {
        this.miscMessageString = miscMessageString;
    }

}
