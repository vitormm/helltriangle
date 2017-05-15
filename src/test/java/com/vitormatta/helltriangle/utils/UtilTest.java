package com.vitormatta.helltriangle.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by vitor.matta on 5/15/17.
 */
@RunWith(JUnit4.class)
public class UtilTest {

    @Test(expected = IllegalArgumentException.class)
    public void testBadInputToParse() throws Throwable{
        final Util util = new Util();
        util.parseInputStringToMatchListOfArrays("aaaaaaaaaaa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBadInputToParse2() throws Throwable{
        final Util util = new Util();
        util.parseInputStringToMatchListOfArrays("[aaaaaaaaaaa]");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBadInputToParse3() throws Throwable{
        final Util util = new Util();
        util.parseInputStringToMatchListOfArrays("[[aaaaaaaaaaa],[gggg,0000]]");
    }
}
