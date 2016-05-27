package net.projecteuler;

public class Problem4 implements ProblemInterface {

    private Problem4() {
    }

    public static void resolve() {
        int largest_palindrome = 0;
        Integer number = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                number = i * j;
                String reversedNumber = stringBuilder.append(number.toString()).reverse().toString();
                if (number.toString().equals(reversedNumber)) {
                    if (largest_palindrome < number) {
                        largest_palindrome = number;
                    }
                }
                stringBuilder.setLength(0);
            }
        }
        System.out.println("Result: " + largest_palindrome);
    }
}
