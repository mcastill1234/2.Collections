import java.util.function.Function;
import java.util.function.Predicate;
import static TestLists.Folks.*;

public class PickDifferentNames {

    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }

    public static void main(final String[] args) {

        {
            final Predicate<String> startsWithN = name -> name.startsWith("N");
            final Predicate<String> startsWithB = name -> name.startsWith("B");

            final long countFriendsStartN =
                    friends.stream().filter(startsWithN).count();
            final long countFriendsStartB =
                    friends.stream().filter(startsWithB).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }

        System.out.println();

        {
            // Use lambda expression returned by checkIfStartsWith()
            final long countFriendsStartN =
                    friends.stream().filter(checkIfStartsWith("N")).count();
            final long countFriendsStartB =
                    friends.stream().filter(checkIfStartsWith("B")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }

        System.out.println();

        {
            final Function<String, Predicate<String>> startsWithLetter =
                    (String letter) -> {
                Predicate<String> checksStarts = (String name) -> name.startsWith(letter);
                return checksStarts;
            };

            final long countFriendsStartN =
                    friends.stream().filter(startsWithLetter.apply("N")).count();
            final long countFriendsStartB =
                    friends.stream().filter(startsWithLetter.apply("B")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }

        System.out.println();

        {
            final Function<String, Predicate<String>> startsWithLetter =
                    (String letter) -> (String name) -> name.startsWith(letter);

            final long countFriendsStartN =
                    friends.stream().filter(startsWithLetter.apply("N")).count();
            final long countFriendsStartB =
                    friends.stream().filter(startsWithLetter.apply("B")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }

        System.out.println();

        {
            final Function<String, Predicate<String>> startsWithLetter =
                    letter -> name -> name.startsWith(letter);

            final long countFriendsStartN =
                    friends.stream().filter(startsWithLetter.apply("N")).count();
            final long countFriendsStartB =
                    friends.stream().filter(startsWithLetter.apply("B")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);

        }

    }


}
