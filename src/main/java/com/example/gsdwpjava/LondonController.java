package com.example.gsdwpjava;

import java.util.concurrent.atomic.AtomicLong;

import org.json.simple.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LondonController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final JSONArray myArray = new JSONArray();

    //this string is the URL for all users in the dataset
    String allUsers = "https://bpdts-test-app.herokuapp.com/users";
    //this StringBuffer stores the data of all users
    JSONArray allUserJA = ApiClass.getDataFromAPI(allUsers);
    //this string is the URL for all users that have London listed as their city
    String londonUsers = "https://bpdts-test-app.herokuapp.com/city/London/users";
    //this JSONArray stores the data of the London based users
    JSONArray londonUserJA = ApiClass.getDataFromAPI(londonUsers);
    /**
     * upon testing several of the results, not only can users say they live in London and live elsewhere
     * they can also live in other Londons, for example Tiffi Colberston (id = 688).
     * therefore I want to add users from our general allUser array to my LondonUsers Array
     */
    JSONArray additionJA = DistanceClass.closeToLondon(allUserJA);
    JSONArray postRemovalArray = DuplicatesClass.removeDuplicates(londonUserJA, additionJA);
    JSONArray finalArray = DuplicatesClass.addUsersPostDuplication(londonUserJA, postRemovalArray);

    @GetMapping("/closeToCity")
    public OutputJA myOutputJA(@RequestParam(value = "cityname", defaultValue = "London") String cityname) {
       return new OutputJA(finalArray);
    }
}
