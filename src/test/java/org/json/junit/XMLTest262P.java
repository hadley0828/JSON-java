package org.json.junit;

import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class XMLTest262P {

    @Test
    public void taskTwoTest() throws FileNotFoundException {
        //GIVEN
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);
        JSONPointer jsonPointer = new JSONPointer("/catalog/book");

        //WHEN
        JSONObject jsonObject = (JSONObject) XML.toJSONObject(fileReader,jsonPointer);

        //THEN
        System.out.println("Next is the test two");
        System.out.println(jsonObject);
    }

    @Test
    public void taskFiveTest(){

    }
}
