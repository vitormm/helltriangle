package com.vitormatta.helltriangle.core;

import com.vitormatta.helltriangle.utils.Util;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by vitor.matta on 5/14/17.
 */
public class HellTriangle {

    private String unparsedTriangleString;
    final static Logger logger = Logger.getLogger(HellTriangle.class);

    public HellTriangle(String unparsedTriangle){
        this.unparsedTriangleString = unparsedTriangle;
    }

    public String getUnparsedTriangleString() {
        return unparsedTriangleString;
    }

    /**
     * Validates triangle data input
     * @return true if input is valid or false if not
     */
    public boolean validateTriangleData(){

        if(getUnparsedTriangleString() == null)
            throw new NullPointerException("Unparsed triangle string cannot be null!!");

        if(unparsedTriangleString.equals("") || unparsedTriangleString.equals(" "))
            throw new IllegalArgumentException("Invalid input!! Triangle string cannot be blank or empty");

        List<int[]> triangleData = Util.parseInputStringToMatchListOfArrays(getUnparsedTriangleString());

        if(triangleData.size() == 0)
            return false;

        for(int i =0; i < triangleData.size(); i++) {
            if( (triangleData.get(i).length > (i+1)) ||
                    (triangleData.get(i).length <= (i))){
                throw new IllegalArgumentException("Malformed input triangle data");
            }
        }

        return true;
    }

    /**
     * Calculate the maximum total of the hell triangle
     * @return maxTotal
     */
    public long getMaxTotal(){

        if(validateTriangleData()){

            String path = "";
            List<int[]> triangleData = Util.parseInputStringToMatchListOfArrays(getUnparsedTriangleString());
            long maxTotal = 0;
            int latestIndex = 0;

            path += triangleData.get(0)[0];
            for (int i = 0; i < triangleData.size(); i++) {

                if(i==0){
                    maxTotal += triangleData.get(0)[0];
                    path = Integer.toString(triangleData.get(0)[0]);
                    continue;
                }

                int[] row = triangleData.get(i);
                int neighbour1 = row[latestIndex];
                int neighbour2 = row[latestIndex + 1];

                if (neighbour2 > neighbour1) {
                    maxTotal += neighbour2;
                    path += " -> " + neighbour2;
                    latestIndex++;
                } else {
                    maxTotal += neighbour1;
                    path += " -> " + neighbour1;
                }
            }

            logger.info("Path used to get maximum total: " + path);
            return maxTotal;
        } else
            return 0;

    }


}
