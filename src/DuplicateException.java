import java.util.*;

/**
 * @author Samosonok Liliia
 * @version 1.0
 */

public class DuplicateException {

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        Collections.addAll(countries, "Andorra", "Ukraine", "China", "Iran",
                "Andorra", "China", "Nepal", "Monaco", "Finland", "India", "Canada",
                "India", "India", "India", "India", "France");
        System.out.println(countries);
        System.out.println(getSetUniqueValues(countries));
        System.out.println(getUniqueValues(countries));
    }

    private static List<String> getSetUniqueValues(List<String> countries) {
        Set<String> hashSet = new LinkedHashSet<>(countries);
        return new ArrayList<>(hashSet);
    }

    private static List<String> getUniqueValues(List<String> countries) {
        List<String> newCountries = new ArrayList<>(countries);
        for (int a = 0; a < newCountries.size(); a++) {
            for (int b = 0; b < a; b++) {
                if (newCountries.get(a).equals(newCountries.get(b))) {
                    newCountries.remove(a);
                    a--;
                }
            }
        }
        return newCountries;
    }
}