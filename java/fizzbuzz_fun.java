import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class FizzBuzzFunctional {

    public static final String fizzbuzzer(int num, Map<Integer, String> replacementMap) {
        return Optional.of(Optional.ofNullable(replacementMap)
                .map(Map::entrySet)
                .orElse(Collections.emptySet())
                .stream()
                .filter(entry -> num % entry.getKey() == 0)
                .map(Map.Entry::getValue)
                .collect(Collectors.joining()))
            .filter(Predicate.not(String::isBlank))
            .orElse(String.valueOf(num));
    }

    public static void main(String[] args) {
        final Map<Integer, String> replacementMap = Map.of(
            3, "Fizz",
            5, "Buzz"
        );

        for (int num = 1; num <= 100; num++) {
            System.out.println(FizzBuzz.fizzbuzzer(num, replacementMap));
        }     
    }
}