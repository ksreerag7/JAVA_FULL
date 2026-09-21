import java.util.ArrayList;

@FunctionalInterface
interface StringCheck {

    public boolean lencheck(String str);
}

public class pgm65 {

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

        StringCheck checklen = (str) -> (str.length() > 5);

        for(String s:list){
            if(checklen.lencheck(s)){
                System.out.println(s);
            }
        }
    }
}