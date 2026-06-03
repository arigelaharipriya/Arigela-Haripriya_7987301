import java.util.*;

public class task27 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("priya");
        names.add("jaya");
        names.add("vybhs");
        names.add("yogi");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}