import java.util.ArrayList;
import java.util.List;
import static TestLists.Folks.friends;

public class Transform {
    public static void main(final String[] args) {

        // Imperative style
        final List<String> uppercaseNames = new ArrayList<String>();
        for (String name : friends) {
            uppercaseNames.add(name.toUpperCase());
        }

        System.out.println(uppercaseNames);

        // Using internal iterator forEach
        final List<String> uppercaseNames1 = new ArrayList<String>();
        friends.forEach(name -> uppercaseNames1.add(name.toUpperCase()));
        System.out.println(uppercaseNames1);

        // Using lambda expressions
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // Count the number of characters in the names
        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));
        System.out.println();

        // Using method references
        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));
    }
}
