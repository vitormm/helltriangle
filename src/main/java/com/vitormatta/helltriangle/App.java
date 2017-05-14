package com.vitormatta.helltriangle;

import org.apache.log4j.Logger;

/**
 * Main class for the hell triangle challenge
 * Author: Vitor Matta
 * Email: vitormm@gmail.com
 *
 */
public class App 
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        if (args == null || args.length == 0)
            throw new IllegalArgumentException("You must supply at least one argument");
        if (args[0] == null)
            throw new IllegalArgumentException("You must supply at least one argument");
    }
}
