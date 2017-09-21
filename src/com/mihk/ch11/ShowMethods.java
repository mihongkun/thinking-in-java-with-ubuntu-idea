package com.mihk.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    private static final String usage = "using\n";

    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();
            if (args.length == 1) {
                for (Method method : methods) {
                    System.out.println(p.matcher(method.toString()).replaceAll(" "));

                }

                for (Constructor constructor : constructors) {
                    System.out.println(p.matcher(constructor.toString()).replaceAll(" "));
                }
                lines = constructors.length +methods.length;
            } else {
                for (Method method:methods){
                    if (method.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(method.toString()).replaceAll(" "));
                        lines ++;
                    }
                }
                for (Constructor constructor:constructors){
                    if (constructor.toString().indexOf(args[1]) != -1) {
                        System.out.println(p.matcher(constructor.toString()).replaceAll(" "));
                        lines ++;
                    }

                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
