import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class RemovedStrings {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        Collections.addAll(animals, "Cat", "Bear", "Cow", "Horse",
                "Elephant", "Lion", "Giraffe", "Wolf", "Dog");
        System.out.println(animals);
        System.out.println(getShortStrings(animals));
    }

    private static List<String> getShortStrings(List<String> animals) {
        List<String> shortStrings = new ArrayList<>();
        for (String animal : animals) {
            if (animal.length() < 5) {
                shortStrings.add(animal);
            }
        }
        return shortStrings;
    }
}