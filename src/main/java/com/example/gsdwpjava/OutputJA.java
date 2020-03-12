package com.example.gsdwpjava;

import org.json.simple.JSONArray;

public class OutputJA {

    private final JSONArray PeopleWithin50Miles;

    public OutputJA(JSONArray PeopleWithin50Miles) {
        this.PeopleWithin50Miles = PeopleWithin50Miles;
    }
    public JSONArray getPeopleWithin50Miles() {
        return PeopleWithin50Miles;
    }

}
