package net.projecteuler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoader {
    public static void main(String[] args) {

        String problemName = "net.projecteuler."+args[0];

        try {
            Method resolve = Class.forName(problemName).getMethod("resolve");
            resolve.invoke(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
