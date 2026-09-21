// Logs messages with optional error code or status flag using overloaded methods.
// Concept: Method overloading — log() with different parameter combinations.
class Logger{
    void log(String msg){
        System.out.println("Info: "+msg);
    }

    void log(String msg, int code){
        System.out.println("Info: " + msg + " | Code: " + code);

    }

    void log(String msg, boolean success){
        System.out.println("Info: " + msg + " | Status: " + success );
    }
}

public class pgm36 {
    public static void main(String[] args) {
        Logger l1 = new Logger();

        l1.log("Server Started");
        l1.log("Server Started",200);
        l1.log("Server Started",true);
    }  
}
