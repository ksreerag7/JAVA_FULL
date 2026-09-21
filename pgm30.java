// Sends a notification message via Email and SMS using a shared Notification interface.
// Concept: Interface with multiple implementing classes — polymorphic method dispatch via send().
interface Notification{
    void send(String msg);
}

class EmailNotification implements Notification{
    public void send(String msg){
        System.out.println(msg);
    }
}

class SMSNotification implements Notification{
    public void send(String msg){
        System.out.println(msg);
    }
}

public class pgm30 {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        n1.send("Hello, your order has been shipped.");
        Notification n2 = new SMSNotification();
        n2.send("Hello, your order has been shipped.");
    }
}
