package com.company;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class PetriNetLoader {

    private Locatie locatie;
    private Tranzitie tranzitie;

    public static void main(String[] args) {

        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        // parsing file "JSONExample.json"
        Object obj = null;

        try {
            FileReader reader = new FileReader("reteaPetri.json");

            // typecasting obj to JSONObject
            JSONObject reteapetri = (JSONObject) jsonParser.parse(reader);

            JSONArray locatii = (JSONArray) reteapetri.get("locatii") ;
            System.out.println(locatii);
            //eroare2
            //Iterator<String> iterator = locatii.get();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    private static void reteaPetriLocatii(JSONObject petri)
    {

        try {
            JSONObject reteaPetri = (JSONObject) petri.get("locatie");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        String name = null;
        try {
            name = (String) petri.get("name");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(name);

        int time=0;
        try {
            time = (int) petri.get("time");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(time);


        int jeton = 0;
        try {
            jeton = (int) petri.get("jeton");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(jeton);
    }

    private static void reteaPetriTranzitii(JSONObject petri)
    {

        try {
            JSONObject reteaPetri = (JSONObject) petri.get("tranzitie");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        String name = null;
        try {
            name = (String) petri.get("name");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(name);

        int time=0;
        try {
            time = (int) petri.get("time");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(time);


        String need="";
        try {
            need =(String) petri.get("need");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(need);


        String to = "";

        try {
            to = (String) petri.get("to");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        System.out.println(to);

    }



}




