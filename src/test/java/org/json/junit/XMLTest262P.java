package org.json.junit;

import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class XMLTest262P {

    @Test
    public void taskTwoTest() throws FileNotFoundException {
        //GIVEN
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);
        JSONPointer jsonPointer = new JSONPointer("/catalog");

        //WHEN
        JSONObject jsonObject = XML.toJSONObject(fileReader,jsonPointer);

        //THEN
        System.out.println("Next is the test two");
        System.out.println(jsonObject);
    }

    @Test
    public void taskFiveTest() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);
        JSONPointer jsonPointer = new JSONPointer("/catalog");

        JSONObject selfMakeObj = new JSONObject().put("JSON","Hello,World!");

        JSONObject resultJsonObj = XML.toJSONObject(fileReader,jsonPointer,selfMakeObj);

        assertEquals("{\"catalog\":{\"JSON\":\"Hello,World!\"}}",resultJsonObj.toString());
    }

    @Test
    public void taskFiveTestReplaceArray() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);
        JSONPointer jsonPointer = new JSONPointer("/catalog/book");

        JSONObject selfMakeObj = new JSONObject().put("JSON","Hello,World!");

        JSONObject resultJsonObj = XML.toJSONObject(fileReader,jsonPointer,selfMakeObj);

        assertEquals("{\"catalog\":{\"book\":{\"JSON\":\"Hello,World!\"}}}",resultJsonObj.toString());
    }
}
