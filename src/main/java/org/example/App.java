package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String a = "asd";
        String b = a;
        a = "mama";
        System.out.println(b); // a is pointing to another object without affecting b

        StringBuilder aa = new StringBuilder("asd");
        StringBuilder bb = aa;
        aa.append("i");
        System.out.println(bb); // aa is pointing to the same object even though it changed it's value, so bb is not affected

        // OutOfMemory error:
        List<BigDecimal> list = new ArrayList<>();
        int i = 0;//
        while(true) {
            ++i;
            list.add(new BigDecimal(i));
        }
    }
}
