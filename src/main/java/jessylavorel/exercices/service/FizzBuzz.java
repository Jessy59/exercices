package jessylavorel.exercices.service;

import java.util.stream.IntStream;

/**
 * @author 20008590
 */
public class FizzBuzz {
    public static void main(String[] args) {

        // Using for loop
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);

        }

        // Using stream api
        IntStream.rangeClosed(1, 100).
                mapToObj(i -> {
                    if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
                    else if (i % 3 == 0) return "Fizz";
                    else if (i % 5 == 0) return "Buzz";
                    else return i;
                })
                .forEach(System.out::println);
    }
}
