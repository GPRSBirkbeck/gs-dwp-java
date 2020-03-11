package com.example.gsdwpjava;

import org.json.simple.JSONArray;

public class OutputJA {

    private final String PeopleWithin50Miles;

    public OutputJA(String contentArray) {
        this.PeopleWithin50Miles = contentArray;
    }
    public String getContentArray() {
        return PeopleWithin50Miles;
    }

}
