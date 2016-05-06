package net.projecteuler;

public class Problem1 implements ProblemInterface {

    private Problem1(){}

    public static void resolve(){
        int sum = 0;
        for(int i = 0; i<1000; i++){
            if(i%3 == 0 || i%5 == 0 ){
                sum += i;
            }
        }
        System.out.println("Result: "+sum);
    }
}
