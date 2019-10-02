package com.xml_parsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import fr.arnaudguyon.xmltojsonlib.JsonToXml;
import fr.arnaudguyon.xmltojsonlib.XmlToJson;

public class MainActivity extends AppCompatActivity {

    String xmlString ="<library>\n" +
            "    <owner>John Doe</owner>\n" +
            "    <book id=\"007\">James Bond</book>\n" +
            "    <book id=\"000\">Book for the dummies</book>\n" +
            "</library>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        XmlToJson xmlToJson = new XmlToJson.Builder(xmlString).build();
        String jsonString = xmlString.toString();
        Log.e("json string is ","<><>"+jsonString);
//        JsonToXml jsonToXml  = new JsonToXml.Builder()
//        String formated_string = jsonToXml.toFormattedString(3);
    }
}
