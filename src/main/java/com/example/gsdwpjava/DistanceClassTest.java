package com.example.gsdwpjava;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DistanceClassTest {
    @Test
    public void distanceTest(){

        /**
         * the below are not lat longs for London, but make for a good test case, as the assertion I use is similar to a
         * result found here https://www.geeksforgeeks.org/program-distance-two-points-earth/
         */
        double londonLat = 53.31861111111111;
        double londonLong = -1.6997222222222223;


        double earthRadiusKilometres = 6371;
        double earthRadiusMiles = 3963;

        JSONObject testObject = new JSONObject();
        testObject.put("latitude", 53.32055555555556);
        testObject.put("longitude", -1.7297222222222221);

            assertEquals(Math.round(DistanceClass.haversineDistance(testObject, earthRadiusKilometres,londonLat,londonLong)*1000)/1000,Math.round(2.0043678382716137*1000)/1000);


    }
    /**
     * to a test to check whether all users are within one globe's distance from london. If they are not, the formula is broken.
     */

}