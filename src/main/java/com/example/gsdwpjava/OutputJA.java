package com.example.gsdwpjava;

import org.json.simple.JSONArray;

public class OutputJA {

    private final String PeopleWithin50Miles;

    public OutputJA(String PeopleWithin50Miles) {
        this.PeopleWithin50Miles = PeopleWithin50Miles;
    }
    public String getPeopleWithin50Miles() {
        return PeopleWithin50Miles;
    }

}
