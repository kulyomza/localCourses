package homeWorkTests.hm26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LauncherPerson {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 22));
        personList.add(new Person("Charlie", 28));
        personList.add(new Person("David", 26));
        personList.add(new Person("John", 32));
        personList.add(new Person("Martin", 50));
        personList.add(new Person("Ann", 25));
        personList.add(new Person("lisa", 21));
        personList.add(new Person("Natan", 44));

        PersonNameComparator comparatorByName = new PersonNameComparator();

        personList.stream().filter(x->x.getAge() > 25).sorted(comparatorByName)
                        .map(x->x.getName() + " " + x.getAge()).forEach(System.out::println);






    }
}
