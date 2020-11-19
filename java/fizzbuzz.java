import java.util.Map;

class FizzBuzz {

    private final Map<Integer, String> replacementMap;

    public FizzBuzz() {
        replacementMap = Map.of(
                3, "Fizz",
                5, "Buzz"
        );
    }

    public final String fizzbuzzer(int num) {
        StringBuilder out = new StringBuilder();

        for (Map.Entry<Integer, String> entry : replacementMap.entrySet()) {
            if (num % entry.getKey() == 0) {
                out.append(entry.getValue());
            }
        }

        if (out.length() == 0) {
            out.append(num);
        } 

        return out.toString();
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();

        for (int num = 1; num <= 100; num++) 
        {
            System.out.println(fb.fizzbuzzer(num));
        }
    }
}