package net.projecteuler;

public class Problem3 implements ProblemInterface {


    private Problem3() {
    }

    public static void resolve() {
        long number = 600851475143L;
        long result = 0;
        for (long i = 1; i <= number; i++) {
            if (number % i == 0 && findPrime(i)) {
                number = number / i;
                result = i;
            }
        }
        System.out.println("Result: "+result);
    }

    static private boolean findPrime(long number) {
        boolean isPrime = true;
        for (long i = 1; i < number; i++) {
            if (i != 1L && i != number && number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
