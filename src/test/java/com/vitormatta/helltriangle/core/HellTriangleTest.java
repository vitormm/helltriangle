package com.vitormatta.helltriangle.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

/**
 * Created by vitor.matta on 5/15/17.
 */
@RunWith(JUnit4.class)
public class HellTriangleTest {

    @Test(expected = NullPointerException.class)
    public void testValidateNullInputs() throws Throwable{
        final HellTriangle hellTriangle = new HellTriangle(null);
        hellTriangle.validateTriangleData();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMalformedArrayInputSizes() throws Throwable{
        final HellTriangle hellTriangle = new HellTriangle("[6],[10,1], [4]");
        hellTriangle.validateTriangleData();
    }

    @Test (expected = IllegalArgumentException.class)
    public void testValidateBlank() throws Throwable{
        final HellTriangle hellTriangle = new HellTriangle(" ");
        hellTriangle.validateTriangleData();
    }

    @Test (expected = IllegalArgumentException.class)
    public void testValidateEmptyInput() throws Throwable{
        final HellTriangle hellTriangle = new HellTriangle("");
        hellTriangle.validateTriangleData();
    }

    @Test
    public void testValidateOkInput() throws Throwable{
        final HellTriangle hellTriangle = new HellTriangle("[[6],[9,8],[5,6,7]]");
        hellTriangle.validateTriangleData();
    }

    @Test
    public void testGetMaxTotal() throws Throwable{
        final HellTriangle hellTriangle = new HellTriangle("[[6],[3,5],[9,7,1],[4,6,8,4]]");
        final long expectedmaxTotal = 26;
        final long maxTotal = hellTriangle.getMaxTotal();
        assertTrue("Maximum total is ok. Expected: " + expectedmaxTotal + ", got: " + maxTotal, expectedmaxTotal == maxTotal);
    }

}
