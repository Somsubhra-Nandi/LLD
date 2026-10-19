interface Notification{
    void send();
}

class EmailNotification implements Notification{
    @Override
    public void send(){
        System.out.println("Sent via mail");
    } 
}

class SMSNotification implements Notification{
    @Override
    public void send(){
        System.out.println("Sent via sms");
    } 
}

abstract class NotificationFactory{
    abstract Notification createNotification(); 

    public void sendNotification(){
        //prev logics
        System.out.println("Started");
        Notification notification = createNotification();
        notification.send();
        //after logics for real system
        System.out.println("Finished");
    }
}

class SMSFactory extends NotificationFactory{
    @Override
    Notification createNotification(){
        return new SMSNotification();
    }
}

class EmailFactory extends NotificationFactory{
    @Override
    Notification createNotification(){
        return new EmailNotification();
    }
}
