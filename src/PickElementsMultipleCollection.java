import java.util.function.Predicate;
import static TestLists.Folks.*;

public class PickElementsMultipleCollection {
    public static void main(final String[] args) {

        {
            // Naive approach using filter() method
            final long countFriendsStartN =
                    friends.stream().filter(name -> name.startsWith("N")).count();
            final long countEditorsStartN =
                    editors.stream().filter(name -> name.startsWith("N")).count();
            final long countComradesStartN =
                    comrades.stream().filter(name -> name.startsWith("N")).count();
            System.out.println(countFriendsStartN);
            System.out.println(countEditorsStartN);
            System.out.println(countComradesStartN);
        }

        {
            // Remove duplication by storing the lambda expression in a Predicate type
            final Predicate<String> startsWithN = name -> name.startsWith("N");
            final long countFriendsStartN =
                    friends.stream().filter(startsWithN).count();
            final long countEditorsStartN =
                    editors.stream().filter(startsWithN).count();
            final long countComradesStartN =
                    comrades.stream().filter(startsWithN).count();

            System.out.println(countFriendsStartN);
            System.out.println(countEditorsStartN);
            System.out.println(countComradesStartN);
        }
    }
}
