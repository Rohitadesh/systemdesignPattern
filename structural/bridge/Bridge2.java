interface MessageSender{
    void sendMessage(String message);
}

class EmailSender implements MessageSender{
    @Override
    public void sendMessage(String message){
        System.out.println(message+"email Sender");
    }
}

class SMSSender implements MessageSender{
    @Override
    public void sendMessage(String message){
        System.out.println(message+"SMS Sender");
    }
}

abstract class UrgentMessage {
    protected MessageSender messageSender;
    public UrgentMessage(MessageSender messageSender){
        this.messageSender=messageSender;
    }

    abstract void sendingMessage();
}


class UrgentEmail extends UrgentMessage{
    public String message;
    public UrgentEmail (String message,MessageSender messageSender){
        super(messageSender);
        this.message=message;
    }
    public void sendingMessage(){
        messageSender.sendMessage(message);
    }
}
class UrgentSMS extends UrgentMessage{
    public String message;
    public UrgentSMS (String message,MessageSender messageSender){
        super(messageSender);
        this.message=message;
    }
    public void sendingMessage(){
        messageSender.sendMessage(message);
    }
}

public class Bridge2 {
    public static void main(String[] args){
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        UrgentMessage emailUrgentMessage = new UrgentEmail("Hello Email sending", emailSender);
        UrgentMessage smsUrgentMessage = new UrgentSMS("Hello,Sms Sending",smsSender);
   
        emailUrgentMessage.sendingMessage();
        smsUrgentMessage.sendingMessage();
        
    }
}
