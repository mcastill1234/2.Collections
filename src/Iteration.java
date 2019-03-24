import java.util.function.Consumer;
import static TestLists.Folks.friends;

public class Iteration {

    public static void main(final String[] args) {

        // Self-inflicted wound patter
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
        System.out.println();

        // A more civilized way to iterate a list
        for (String name : friends) {
            System.out.println(name);
        }
        System.out.println();

        // Using forEach with anonymous inner class syntax
        friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });
        System.out.println();

        // Using lambda expression instead
        friends.forEach((final String name) -> System.out.println(name));

        // Same code without type information
        friends.forEach((name) -> System.out.println(name));

        // Leaving off parentheses around parameter if inferred
        friends.forEach(name -> System.out.println(name));

        // Using method reference
        friends.forEach(System.out::println);

    }
}
