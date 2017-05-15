package com.vitormatta.helltriangle.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vitor.matta on 5/14/17.
 */
public class Util {

    /**
     * parseInputStringToMatchArrayOfArrays
     * Parse the input string to match the array of arrays pattern for the hells triangle input
     * @param inputText is the text provided by the user
     * @return List of array of int with the array of hell triangle
     */

    public static List<int[]> parseInputStringToMatchListOfArrays(String inputText) {
        String firstRegexPattern = "(\\[|\\{)(.+)(\\]|\\})"; //matches [..........]
        Pattern pattern = Pattern.compile(firstRegexPattern);
        Matcher matcher = pattern.matcher(inputText);
        String stringWithArrays = "";

        //if inputText is equal to [[number],[number,number]...] matches 3 groups [,  [],[],[] and ]

        if (matcher.find()) {
            stringWithArrays = matcher.group();
        } else{
            throw new IllegalArgumentException(
                    "Invalid Input!! Please provide a valid input like \"[[6],[3,5],[9,7,1],[4,6,8,4]]\"");
        }

        List<int[]> triangleRows = new ArrayList<>();
        String secondRegexPattern = "((\\[|\\{)(((\\d+),?)+)(\\]|\\}))"; //matches array of numbers
        pattern = Pattern.compile(secondRegexPattern);
        matcher = pattern.matcher(stringWithArrays);
        int matchCount = 0;
        while (matcher.find()) {
            String group = matcher.group(3); //third group contains the data
            int[] array = Arrays.asList(group.split(",")).stream().mapToInt(Integer::parseInt).toArray();
            triangleRows.add(array);
            matchCount++;
        }

        if(matchCount == 0)
            throw new IllegalArgumentException(
                    "Invalid Input!! Please provide a valid input like \"[[6],[3,5],[9,7,1],[4,6,8,4]]\"");

        return triangleRows;
    }

}
