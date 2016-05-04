package net.projecteuler;

public class Problem3 {

    Problem3() {
        long number = 600851475143L;
        for (long i = 1; i < number; i++) {
            if (number % i == 0 && findPrime(i)) {
                System.out.println("The number: " + i + " is prime");
            }
        }
    }

    static boolean findPrime(long number) {
        boolean isPrime = true;
        for (long i = 1; i < number; i++) {
            if (i != 1L && i != number && number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
