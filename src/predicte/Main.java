package predicte;

import java.time.Instant;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person salah = new Person("Salah", 26);
        Predicate<Person> isOlderThan18 = p -> p.age > 18;
        Predicate<Person> isLessThanSixty = p -> p.age < 60;

   boolean isSalahOver18 = isPersonEligibleForVoting(salah, isOlderThan18);
        System.out.println("isSalahOver18: " + isSalahOver18);

        // I want to know if salah is over 18 and under 60
        boolean isSalahOver18AndUnder60 = isPersonEligibleForVoting(salah, isOlderThan18.and(isLessThanSixty));
        System.out.println("isSalahOver18AndUnder60: " + isSalahOver18AndUnder60);

        boolean isSalahOver18AndOver60 = isPersonEligibleForVoting(salah, isOlderThan18.negate().and(isLessThanSixty));
        System.out.println("isSalahOver18AndOver60: " + isSalahOver18AndOver60);

    }

    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}