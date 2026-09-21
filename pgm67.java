import java.util.ArrayList;

public class pgm67 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Monica");
        list.add("Robert");
        list.add("Joey");
        list.add("Alexander");
        list.add("Phoebe");
        list.add("Christopher");
        list.add("Chandler");
        list.add("Rachel");
        list.add("Ross");
        
        list.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

    }
}