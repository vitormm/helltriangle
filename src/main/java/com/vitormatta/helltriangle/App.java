package com.vitormatta.helltriangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args == null || args.length == 0)
            throw new IllegalArgumentException("You must supply at least one argument");
        if (args[0] == null)
            throw new IllegalArgumentException("You must supply at least one argument");

    }
}
