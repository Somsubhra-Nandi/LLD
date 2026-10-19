class Notification{
    private String text;
    Notification(String text){
        this.text=text;
    }
    public String getText() {
        return text;
    }
    public void sendNotification(){
        System.out.println(text + "Successfully sent the notification to the user");

    }
}

class SmsNotification extends Notification{
    SmsNotification(String text){
        super(text);
    }
    @Override
    public void sendNotification(){
        System.out.println(getText() + "Successfully sent the notification to the user via sms");
    }
}

class WpNotification extends Notification{
    WpNotification(String text){
        super(text);
    }
    @Override
    public void sendNotification(){
        System.out.println(getText() + "Successfully sent the notification to the user via whatsapp");
    }
}