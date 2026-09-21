// Adds email addresses to a set, showing that duplicates are automatically ignored.
// Concept: HashSet — stores only unique elements, no duplicates allowed.
import java.util.HashSet;


public class pgm44 {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        emails.add("alice@gmail.com");
        emails.add("bob@gmail.com");
        emails.add("carol@gmail.com");
        emails.add("alice@gmail.com");
        emails.add("monica@gmail.com");

        System.out.println(emails.contains("alice@gmail.com"));
        emails.remove("bob@gmail.com");
        System.out.println(emails.size());
        System.out.println(emails);
    }   
}
