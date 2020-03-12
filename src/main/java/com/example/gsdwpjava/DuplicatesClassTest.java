package com.example.gsdwpjava;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesClassTest {
    /**
     * run my test on the assumption that my london set is zero, one where my alluser set is zero,
     * In future:
     * one where we go for our max (so allUser == 1000)
     * with alluser == 1000, removeduplicates should return a return Array that is the max size (1000), and shouldnt be 1000+number in London array.
     */
    @Test
    public void testRemoveDuplicatesBothIdentical(){
        JSONObject myObject = new JSONObject();
        myObject.put("id", 1);
        JSONArray londonArray = new JSONArray();
        londonArray.add(0, myObject);
        JSONArray additionArray = new JSONArray();
        additionArray.add(0,myObject);
        JSONArray emptyJA = new JSONArray();
        assertEquals(DuplicatesClass.removeDuplicates(londonArray, additionArray), emptyJA);
    }
    @Test
    public void testRemoveDuplicatesBothEmpty(){
        JSONArray londonArray = new JSONArray();
        JSONArray additionArray = new JSONArray();
        JSONArray emptyJA = new JSONArray();
        assertEquals(DuplicatesClass.removeDuplicates(londonArray, additionArray), emptyJA);
    }
}