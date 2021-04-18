public class UnkownMessage implements IrcMessage {
    
    public final String messageContent;

    public UnkownMessage(String messageContent) {
        this.messageContent = messageContent;
    }

}
