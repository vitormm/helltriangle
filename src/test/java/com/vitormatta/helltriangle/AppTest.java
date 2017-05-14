package com.vitormatta.helltriangle;

import com.vitormatta.helltriangle.App;
import org.junit.Assert;
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

}
