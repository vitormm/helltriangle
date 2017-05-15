package com.vitormatta.helltriangle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for Main Application class
 */
@RunWith(JUnit4.class)
public class AppTest 
{

    @Test (expected = IllegalArgumentException.class)
    public void testRunAppWithNoInputArgs() throws Throwable{
        String[] args = null;
        App.main( args );
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRunAppWithEmptyInputArgs() throws Throwable{
        String[] args = { "" };
        App.main( args );
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRunAppWithBlankInputArgs() throws Throwable{
        String[] args = { " " };
        App.main( args );
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRunAppWithInvalidStringInputArgs() throws Throwable{
        String[] args = { " It must accept an array and not this text!" };
        App.main( args );
    }

}
