import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static TestLists.Folks.friends;

public class PickElements {
    public static void main(final String[] args) {

        final List<String> startsWithN = new ArrayList<String>();
        for (String name : friends) {
            if (name.startsWith("N")) {
                startsWithN.add(name);
            }
        }
        System.out.println(String.format("Found %d names", startsWithN.size()));

        final List<String> startsWithN1 =
                friends.stream().filter(name -> name.startsWith("N")).collect(Collectors.toList());
        System.out.println(String.format("Found %d names", startsWithN.size()));

    }
}
