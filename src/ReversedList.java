import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class ReversedList {

    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        Collections.addAll(birds, "Owl", "Eagle", "Crow", "Falcon",
                "Sparrow", "Finch", "Starling");
        System.out.println(birds);
        System.out.println(getReversedList(birds));
    }

    private static List<String> getReversedList(List<String> birds) {
        List<String> result = new ArrayList<>();
        int count = birds.size() - 1;
        while (count > 0) {
            count--;
        }
        for (String bird : birds) {
            result.add(count, bird);
        }
        return result;
    }
}