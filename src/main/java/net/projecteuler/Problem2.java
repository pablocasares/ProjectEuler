package net.projecteuler;

public class Problem2 implements ProblemInterface {

    private Problem2(){}

    public static void resolve(){
        long fibonacciSum = 0;
        long i = 1;
        long j = 1;
        long k;

        while(j<4000000L){
            k = j;
            j = i + j;
            i = k;
            if(j%2 == 0){
                fibonacciSum += j;
            }
        }
        System.out.println("Result: "+fibonacciSum);
    }
}
