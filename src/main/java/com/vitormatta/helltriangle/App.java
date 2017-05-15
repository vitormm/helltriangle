package com.vitormatta.helltriangle;

import com.vitormatta.helltriangle.core.HellTriangle;
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
        if (args == null || args.length == 0 || args[0] == null)
            throw new IllegalArgumentException("You must supply at least one argument");

        String inputText = args[0].replace(" ", "").trim();
        HellTriangle hellTriangle = new HellTriangle(inputText);

        long maxTotal = hellTriangle.getMaxTotal();
        logger.info("Total: " + maxTotal);
        System.out.println(maxTotal);

    }
}
