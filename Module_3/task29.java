import java.util.List;

record Person(String name, int age) {}

public class task29 {
    public static void main(String[] args) {

        Person p1 = new Person("Priya", 20);
        Person p2 = new Person("Vybhs", 19);
        Person p3 = new Person("Navya", 25);

        System.out.println(p1);
        System.out.println(p2);

        List<Person> people = List.of(p1, p2, p3);

        System.out.println("\nPeople aged 18 or above:");

        people.stream()
              .filter(person -> person.age() >= 18)
              .forEach(System.out::println);
    }
}