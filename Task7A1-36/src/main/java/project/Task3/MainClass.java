package project.Task3;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user1 = new User(1, "Andrey", "Kravchenko", 18, "England");
        User user2 = new User(2, "Danil", "Koliagin", 20, "Ukraine");
        User user3 = new User(3, "Nastya", "Shvidka", 17, "Germany");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        System.out.println("All list: ");
        System.out.println(userList);
        System.out.println("");

        Collections.sort(userList, Comparator.comparing(User::getCountry));
        Collections.sort(userList, Comparator.comparing(User::getAge));

        System.out.println("Sort by country an age: ");
        System.out.println(userList);
        System.out.println("");

        System.out.println("Select all\n" +
                "users older than the specified age, the first letter of their name\n" +
                "starts with a given letter: ");
        System.out.println(userList.stream().filter(((Predicate<? super User>) u -> u.getAge() > 18)).filter(u -> u.getFirstName()
                .startsWith("D")).collect(Collectors.toList()));
        System.out.println("");

        System.out.println("Find min and max age: ");
        System.out.println(userList.stream().findFirst());
        System.out.println(userList.get(userList.size() - 1));
    }
}
