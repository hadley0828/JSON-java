package org.json.junit;

import org.json.JSONObject;
import org.json.XML;

import java.util.Scanner;

public class Milestone1 {
    //Milestone1 task4
    public static void main(String[] args) {
        JSONObject jsonObj = new JSONObject();

        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;

        long startTime=System.currentTimeMillis();
        jsonObj = XML.toJSONObject(XmlUtils.xmlFile2String(filePath));
        System.out.println(jsonObj);
        JsonUtils.recursiveJsonObject(jsonObj);
        long endTime=System.currentTimeMillis();
        System.out.println("the time cost is "+(endTime-startTime)+"ms");

        System.out.println(jsonObj);
    }
}
