import java.util.List;

public class Main {

    public static void main(String[] args) {

        var list = List.of("string1", "string2");
        list.add("string3");
        System.out.println(list);
    }
}