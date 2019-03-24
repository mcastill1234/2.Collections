import java.util.List;
import java.util.Optional;

import static TestLists.Folks.friends;

public class PickAnElementElegant {
    public static void pickName(final List<String> names, final String startingLetter) {

        final Optional<String> foundName =
                names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();

        System.out.println(String.format("A name with %s: %s",
                startingLetter, foundName.orElse("No name found")));
    }

    public static void main(final String[] args) {

        pickName(friends, "N");
        pickName(friends, "Z");
    }
}
