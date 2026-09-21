import java.util.ArrayList;

public class pgm66 {

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

        list.stream().filter(s -> s.length()>5).forEach(s->System.out.println(s));
    }
}