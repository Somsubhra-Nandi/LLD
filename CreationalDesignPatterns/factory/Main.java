class Main {
    public static void main(String[] args) {
        NotificationFactory UsableNotification = new SMSFactory();
        UsableNotification.sendNotification();
    }
}