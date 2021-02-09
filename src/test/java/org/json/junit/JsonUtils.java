package org.json.junit;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class JsonUtils {

    /*
    fileName: a.xml
    the outputAFileName: a.json
     */
    public static void writeJsonFile(JSONObject jsonObj, String fileName) throws IOException {

        String jsonFileName = fileName.substring(0,fileName.lastIndexOf(".")) + ".json";
        FileWriter fw = new FileWriter(new File(jsonFileName));
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(jsonObj.toString());
        bw.flush();
    }

    public static void writeJsonFile(String str, String fileName) throws IOException{
        String jsonFileName = fileName.substring(0,fileName.lastIndexOf(".")) + ".json";
        FileWriter fw = new FileWriter(new File(jsonFileName));
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.flush();
    }

    /*
    recursive the json object from top to down level
     */
    public static void recursiveJsonObject(Object obj){
        // use partly code from : my.oschina.net/u/435726/blog/2980842
        if(obj instanceof JSONArray){
            JSONArray jsonArray = (JSONArray) obj;
            if(jsonArray.length() > 0){
                for(int i = 0; i < jsonArray.length(); i++){
                    recursiveJsonObject(jsonArray.get(i));
                }
            }

        }else if(obj instanceof JSONObject){
            JSONObject jsonObject = (JSONObject) obj;
            Set<String> allKey = jsonObject.keySet();
            Iterator<String> iterator = allKey.iterator();

            List<String> oldKeyList = new ArrayList<>();
            List<String> newKeyList = new ArrayList<>();
            List<Object> valueList = new ArrayList<>();

            while(iterator.hasNext()){
                String oneKey = iterator.next();
//                System.out.println("the current key is " + oneKey);
                Object oneValue = jsonObject.get(oneKey);
                //when do iter operations, Can't modify the key in it, this will cause ConcurrentModificationException
                //solution: store the old object and the new object and do operation after the iter
                String newKey = "swe262_" + oneKey;

                oldKeyList.add(oneKey);
                newKeyList.add(newKey);
                valueList.add(oneValue);

            }
            for(int i = 0; i < oldKeyList.size(); i++){
                jsonObject.remove(oldKeyList.get(i));
                jsonObject.put(newKeyList.get(i), valueList.get(i));
            }
            for(int i = 0; i < valueList.size(); i++){
                Object oneValue = valueList.get(i);
                if(oneValue instanceof JSONArray){
                    JSONArray lowLevelArr = (JSONArray) oneValue;
                    recursiveJsonObject(lowLevelArr);
                }else if(oneValue instanceof JSONObject){
                    recursiveJsonObject(oneValue);
                }else{
//                    System.out.println(newKeyList.get(i) + "<<===>>"+ oneValue.toString());
                }
            }

        }
    }


    /*
    use stack to search for position in order
     */
    public static void recursiveForFive(Object obj,  JSONObject newObj, Stack<String> stack){
        if(obj instanceof JSONArray){
            JSONArray jsonArray = (JSONArray) obj;
            if(jsonArray.length() > 0){
                for(int i = 0; i < jsonArray.length(); i++){
                    if(String.valueOf(i).equals(stack.peek())){
                        stack.pop();
                        if(stack.empty()){
                            jsonArray.put(i,newObj);
                            return;
                        }
                        recursiveForFive(jsonArray.get(i),newObj,stack);
                    }

                }
            }
        }else if(obj instanceof JSONObject){

            JSONObject jsonObject = (JSONObject) obj;
            Set<String> allKey = jsonObject.keySet();
            Iterator<String> iterator = allKey.iterator();

            String oldKey = "";

            while(iterator.hasNext()){
                String oneKey = iterator.next();
                Object oneValue = jsonObject.get(oneKey);

                if(oneKey.equals(stack.peek())){
                    stack.pop();
                    if(stack.empty()){
                        oldKey = oneKey;
                        jsonObject.remove(oldKey);
                        jsonObject.put(oldKey,newObj);
                        return;
                    }
                    if(oneValue instanceof JSONArray){
                        JSONArray lowLevelArr = (JSONArray) oneValue;
                        recursiveForFive(lowLevelArr,newObj,stack);
                    }else if(oneValue instanceof JSONObject){
                        recursiveForFive(oneValue,newObj,stack);
                    }else{
                        System.out.println(oneKey + "<<===>>"+ oneValue.toString());
                    }
                }
            }

        }
    }
}
