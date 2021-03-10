package org.json.junit;

import org.json.JSONObject;
import org.json.XML;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

public class Milestone5 {

    @Test
    public void testOneThread() throws FileNotFoundException, ExecutionException, InterruptedException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);

        Future<JSONObject> future = XML.toJSONObjectForAsync(fileReader);
        while(!future.isDone()){
            System.out.println("the " + fileName + " parsing is currently in process");
            Thread.sleep(300);
        }
        JSONObject result = future.get();
        assertEquals(result.toString(),"{\"catalog\":{\"book\":[{\"author\":\"Gambardella, Matthew\",\"price\":44.95,\"genre\":\"Computer\",\"description\":\"An in-depth look at creating applications\\n            with XML.\",\"id\":\"bk101\",\"title\":\"XML Developer's Guide\",\"publish_date\":\"2000-10-01\"},{\"author\":\"Ralls, Kim\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"A former architect battles corporate zombies,\\n            an evil sorceress, and her own childhood to become queen\\n            of the world.\",\"id\":\"bk102\",\"title\":\"Midnight Rain\",\"publish_date\":\"2000-12-16\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"After the collapse of a nanotechnology\\n            society in England, the young survivors lay the\\n            foundation for a new society.\",\"id\":\"bk103\",\"title\":\"Maeve Ascendant\",\"publish_date\":\"2000-11-17\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"In post-apocalypse England, the mysterious\\n            agent known only as Oberon helps to create a new life\\n            for the inhabitants of London. Sequel to Maeve\\n            Ascendant.\",\"id\":\"bk104\",\"title\":\"Oberon's Legacy\",\"publish_date\":\"2001-03-10\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"The two daughters of Maeve, half-sisters,\\n            battle one another for control of England. Sequel to\\n            Oberon's Legacy.\",\"id\":\"bk105\",\"title\":\"The Sundered Grail\",\"publish_date\":\"2001-09-10\"},{\"author\":\"Randall, Cynthia\",\"price\":4.95,\"genre\":\"Romance\",\"description\":\"When Carla meets Paul at an ornithology\\n            conference, tempers fly as feathers get ruffled.\",\"id\":\"bk106\",\"title\":\"Lover Birds\",\"publish_date\":\"2000-09-02\"},{\"author\":\"Thurman, Paula\",\"price\":4.95,\"genre\":\"Romance\",\"description\":\"A deep sea diver finds true love twenty\\n            thousand leagues beneath the sea.\",\"id\":\"bk107\",\"title\":\"Splish Splash\",\"publish_date\":\"2000-11-02\"},{\"author\":\"Knorr, Stefan\",\"price\":4.95,\"genre\":\"Horror\",\"description\":\"An anthology of horror stories about roaches,\\n            centipedes, scorpions  and other insects.\",\"id\":\"bk108\",\"title\":\"Creepy Crawlies\",\"publish_date\":\"2000-12-06\"},{\"author\":\"Kress, Peter\",\"price\":6.95,\"genre\":\"Science Fiction\",\"description\":\"After an inadvertant trip through a Heisenberg\\n            Uncertainty Device, James Salway discovers the problems\\n            of being quantum.\",\"id\":\"bk109\",\"title\":\"Paradox Lost\",\"publish_date\":\"2000-11-02\"},{\"author\":\"O'Brien, Tim\",\"price\":36.95,\"genre\":\"Computer\",\"description\":\"Microsoft's .NET initiative is explored in\\n            detail in this deep programmer's reference.\",\"id\":\"bk110\",\"title\":\"Microsoft .NET: The Programming Bible\",\"publish_date\":\"2000-12-09\"},{\"author\":\"O'Brien, Tim\",\"price\":36.95,\"genre\":\"Computer\",\"description\":\"The Microsoft MSXML3 parser is covered in\\n            detail, with attention to XML DOM interfaces, XSLT processing,\\n            SAX and more.\",\"id\":\"bk111\",\"title\":\"MSXML3: A Comprehensive Guide\",\"publish_date\":\"2000-12-01\"},{\"author\":\"Galos, Mike\",\"price\":49.95,\"genre\":\"Computer\",\"description\":\"Microsoft Visual Studio 7 is explored in depth,\\n            looking at how Visual Basic, Visual C++, C#, and ASP+ are\\n            integrated into a comprehensive development\\n            environment.\",\"id\":\"bk112\",\"title\":\"Visual Studio 7: A Comprehensive Guide\",\"publish_date\":\"2001-04-16\"}]}}");

    }

    @Test
    public void testTwoThreadsOneByOne() throws FileNotFoundException {
        String root = System.getProperty("user.dir");

        String fileName1 = "orders.xml";
        String filePath1 = root + "/src/test/java/org/json/junit/xmls/"+fileName1;
        FileReader fileReader1 = new FileReader(filePath1);

        String fileName2 = "nasa.xml";
        String filePath2 = root + "/src/test/java/org/json/junit/xmls/"+fileName2;
        FileReader fileReader2 = new FileReader(filePath2);

        long startTime = System.currentTimeMillis();

        JSONObject object1 = XML.toJSONObject(fileReader1);
        JSONObject object2 = XML.toJSONObject(fileReader2);

        long endTime = System.currentTimeMillis();
        System.out.println("using two threads one by one costs " + (endTime - startTime) + " millisecond");
    }

    @Test
    public void testTwoThreadsAsAList() throws FileNotFoundException {
        String root = System.getProperty("user.dir");

        String fileName1 = "orders.xml";
        String filePath1 = root + "/src/test/java/org/json/junit/xmls/"+fileName1;
        FileReader fileReader1 = new FileReader(filePath1);

        String fileName2 = "nasa.xml";
        String filePath2 = root + "/src/test/java/org/json/junit/xmls/"+fileName2;
        FileReader fileReader2 = new FileReader(filePath2);

        List<Reader> readerList = new ArrayList<>();
        readerList.add(fileReader1);
        readerList.add(fileReader2);


        try {
            long startTime = System.currentTimeMillis();

            List<Future<JSONObject>> futureList = XML.toJSONObjectForMultiReader(readerList);
            for(int i = 0; i < futureList.size(); i++){
                JSONObject jsonObject = futureList.get(i).get();
            }

            long endTime = System.currentTimeMillis();
            System.out.println("using two threads ASYNC in a List costs " + (endTime - startTime) + " millisecond");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }

    }

    @Test
    public void testTwoThreadsAsync() throws FileNotFoundException {
        String root = System.getProperty("user.dir");

        String fileName1 = "orders.xml";
        String filePath1 = root + "/src/test/java/org/json/junit/xmls/"+fileName1;
        FileReader fileReader1 = new FileReader(filePath1);

        String fileName2 = "nasa.xml";
        String filePath2 = root + "/src/test/java/org/json/junit/xmls/"+fileName2;
        FileReader fileReader2 = new FileReader(filePath2);




        try {
            long startTime = System.currentTimeMillis();
            Future<JSONObject> future1 = XML.toJSONObjectForAsync(fileReader1);
            JSONObject object1 = future1.get();


            Future<JSONObject> future2 = XML.toJSONObjectForAsync(fileReader2);
            JSONObject object2 = future2.get();

            long endTime = System.currentTimeMillis();

//            System.out.println("using two threads ASYNC costs " + (endTime - startTime) + " millisecond");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
