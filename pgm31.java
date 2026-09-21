// Sends a message via Email, SMS, and Push notifications.
// Concept: Interface with 3 implementations demonstrating interface-based polymorphism.
interface Notification{
    void send(String msg);
}

class EmailNotification implements Notification{
    public void send(String msg){
        System.out.println("EMAIL: "+msg);
    }
}

class SMSNotification implements Notification{
    public void send(String msg){
        System.out.println("SMS: "+msg);
    }
}

class PushNotification implements Notification{
    public void send(String msg){
        System.out.println("PUSH: "+msg);
    }
}


public class pgm31 {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new PushNotification();

        String msg = "Hello Alice";

        n1.send(msg);
        n2.send(msg);
        n3.send(msg);
    }
    
}
