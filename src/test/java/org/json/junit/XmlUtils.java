package org.json.junit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class XmlUtils {

    /*
    read XML file into one String
     */
    public static String xmlFile2String(String fileName){
        String result = "";
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            String temp = "";
            while((temp = br.readLine()) != null){
                //use function trim() to deal with the space problem in books.xml's description
                result = result + temp.trim() + " ";
//                System.out.println(temp);
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }


}