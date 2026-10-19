class Main{
    public static void main(String[] args){
        Notification notification = new SmsNotification("Hi, Somsubhra is the goat.");
        notification.sendNotification();
    }
}