import java.util.*;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Sampath", 20),
            new Person("Mercilin", 22),
            new Person("John", 17)
        );

        System.out.println("All People:");
        people.forEach(System.out::println);

        System.out.println("\nAdults (age >= 18):");
        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}
