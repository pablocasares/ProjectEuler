package net.projecteuler;

public class ClassLoader {
    public static void main(String[] args) {

        String problemName = "net.projecteuler."+args[0];

        try {
            Class<?> problem = Class.forName(problemName);
            problem.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
