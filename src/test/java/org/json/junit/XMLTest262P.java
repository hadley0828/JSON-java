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
        Object resultObject = XML.toJSONObject(fileReader,jsonPointer);

        //THEN
        System.out.println("Next is the test two");

        String osName = System.getProperty("os.name");
        if (osName.startsWith("Mac OS")) {
            // apple
            assertEquals("{\"book\":[{\"author\":\"Gambardella, Matthew\",\"price\":44.95,\"genre\":\"Computer\",\"description\":\"An in-depth look at creating applications\\n            with XML.\",\"id\":\"bk101\",\"title\":\"XML Developer's Guide\",\"publish_date\":\"2000-10-01\"},{\"author\":\"Ralls, Kim\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"A former architect battles corporate zombies,\\n            an evil sorceress, and her own childhood to become queen\\n            of the world.\",\"id\":\"bk102\",\"title\":\"Midnight Rain\",\"publish_date\":\"2000-12-16\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"After the collapse of a nanotechnology\\n            society in England, the young survivors lay the\\n            foundation for a new society.\",\"id\":\"bk103\",\"title\":\"Maeve Ascendant\",\"publish_date\":\"2000-11-17\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"In post-apocalypse England, the mysterious\\n            agent known only as Oberon helps to create a new life\\n            for the inhabitants of London. Sequel to Maeve\\n            Ascendant.\",\"id\":\"bk104\",\"title\":\"Oberon's Legacy\",\"publish_date\":\"2001-03-10\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"The two daughters of Maeve, half-sisters,\\n            battle one another for control of England. Sequel to\\n            Oberon's Legacy.\",\"id\":\"bk105\",\"title\":\"The Sundered Grail\",\"publish_date\":\"2001-09-10\"},{\"author\":\"Randall, Cynthia\",\"price\":4.95,\"genre\":\"Romance\",\"description\":\"When Carla meets Paul at an ornithology\\n            conference, tempers fly as feathers get ruffled.\",\"id\":\"bk106\",\"title\":\"Lover Birds\",\"publish_date\":\"2000-09-02\"},{\"author\":\"Thurman, Paula\",\"price\":4.95,\"genre\":\"Romance\",\"description\":\"A deep sea diver finds true love twenty\\n            thousand leagues beneath the sea.\",\"id\":\"bk107\",\"title\":\"Splish Splash\",\"publish_date\":\"2000-11-02\"},{\"author\":\"Knorr, Stefan\",\"price\":4.95,\"genre\":\"Horror\",\"description\":\"An anthology of horror stories about roaches,\\n            centipedes, scorpions  and other insects.\",\"id\":\"bk108\",\"title\":\"Creepy Crawlies\",\"publish_date\":\"2000-12-06\"},{\"author\":\"Kress, Peter\",\"price\":6.95,\"genre\":\"Science Fiction\",\"description\":\"After an inadvertant trip through a Heisenberg\\n            Uncertainty Device, James Salway discovers the problems\\n            of being quantum.\",\"id\":\"bk109\",\"title\":\"Paradox Lost\",\"publish_date\":\"2000-11-02\"},{\"author\":\"O'Brien, Tim\",\"price\":36.95,\"genre\":\"Computer\",\"description\":\"Microsoft's .NET initiative is explored in\\n            detail in this deep programmer's reference.\",\"id\":\"bk110\",\"title\":\"Microsoft .NET: The Programming Bible\",\"publish_date\":\"2000-12-09\"},{\"author\":\"O'Brien, Tim\",\"price\":36.95,\"genre\":\"Computer\",\"description\":\"The Microsoft MSXML3 parser is covered in\\n            detail, with attention to XML DOM interfaces, XSLT processing,\\n            SAX and more.\",\"id\":\"bk111\",\"title\":\"MSXML3: A Comprehensive Guide\",\"publish_date\":\"2000-12-01\"},{\"author\":\"Galos, Mike\",\"price\":49.95,\"genre\":\"Computer\",\"description\":\"Microsoft Visual Studio 7 is explored in depth,\\n            looking at how Visual Basic, Visual C++, C#, and ASP+ are\\n            integrated into a comprehensive development\\n            environment.\",\"id\":\"bk112\",\"title\":\"Visual Studio 7: A Comprehensive Guide\",\"publish_date\":\"2001-04-16\"}]}",resultObject.toString());
        } else if (osName.startsWith("Windows")) {
            // windows
            assertEquals("{\"book\":[{\"author\":\"Gambardella, Matthew\",\"price\":44.95,\"genre\":\"Computer\",\"description\":\"An in-depth look at creating applications\\r\\n            with XML.\",\"id\":\"bk101\",\"title\":\"XML Developer's Guide\",\"publish_date\":\"2000-10-01\"},{\"author\":\"Ralls, Kim\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"A former architect battles corporate zombies,\\r\\n            an evil sorceress, and her own childhood to become queen\\r\\n            of the world.\",\"id\":\"bk102\",\"title\":\"Midnight Rain\",\"publish_date\":\"2000-12-16\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"After the collapse of a nanotechnology\\r\\n            society in England, the young survivors lay the\\r\\n            foundation for a new society.\",\"id\":\"bk103\",\"title\":\"Maeve Ascendant\",\"publish_date\":\"2000-11-17\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"In post-apocalypse England, the mysterious\\r\\n            agent known only as Oberon helps to create a new life\\r\\n            for the inhabitants of London. Sequel to Maeve\\r\\n            Ascendant.\",\"id\":\"bk104\",\"title\":\"Oberon's Legacy\",\"publish_date\":\"2001-03-10\"},{\"author\":\"Corets, Eva\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"The two daughters of Maeve, half-sisters,\\r\\n            battle one another for control of England. Sequel to\\r\\n            Oberon's Legacy.\",\"id\":\"bk105\",\"title\":\"The Sundered Grail\",\"publish_date\":\"2001-09-10\"},{\"author\":\"Randall, Cynthia\",\"price\":4.95,\"genre\":\"Romance\",\"description\":\"When Carla meets Paul at an ornithology\\r\\n            conference, tempers fly as feathers get ruffled.\",\"id\":\"bk106\",\"title\":\"Lover Birds\",\"publish_date\":\"2000-09-02\"},{\"author\":\"Thurman, Paula\",\"price\":4.95,\"genre\":\"Romance\",\"description\":\"A deep sea diver finds true love twenty\\r\\n            thousand leagues beneath the sea.\",\"id\":\"bk107\",\"title\":\"Splish Splash\",\"publish_date\":\"2000-11-02\"},{\"author\":\"Knorr, Stefan\",\"price\":4.95,\"genre\":\"Horror\",\"description\":\"An anthology of horror stories about roaches,\\r\\n            centipedes, scorpions  and other insects.\",\"id\":\"bk108\",\"title\":\"Creepy Crawlies\",\"publish_date\":\"2000-12-06\"},{\"author\":\"Kress, Peter\",\"price\":6.95,\"genre\":\"Science Fiction\",\"description\":\"After an inadvertant trip through a Heisenberg\\r\\n            Uncertainty Device, James Salway discovers the problems\\r\\n            of being quantum.\",\"id\":\"bk109\",\"title\":\"Paradox Lost\",\"publish_date\":\"2000-11-02\"},{\"author\":\"O'Brien, Tim\",\"price\":36.95,\"genre\":\"Computer\",\"description\":\"Microsoft's .NET initiative is explored in\\r\\n            detail in this deep programmer's reference.\",\"id\":\"bk110\",\"title\":\"Microsoft .NET: The Programming Bible\",\"publish_date\":\"2000-12-09\"},{\"author\":\"O'Brien, Tim\",\"price\":36.95,\"genre\":\"Computer\",\"description\":\"The Microsoft MSXML3 parser is covered in\\r\\n            detail, with attention to XML DOM interfaces, XSLT processing,\\r\\n            SAX and more.\",\"id\":\"bk111\",\"title\":\"MSXML3: A Comprehensive Guide\",\"publish_date\":\"2000-12-01\"},{\"author\":\"Galos, Mike\",\"price\":49.95,\"genre\":\"Computer\",\"description\":\"Microsoft Visual Studio 7 is explored in depth,\\r\\n            looking at how Visual Basic, Visual C++, C#, and ASP+ are\\r\\n            integrated into a comprehensive development\\r\\n            environment.\",\"id\":\"bk112\",\"title\":\"Visual Studio 7: A Comprehensive Guide\",\"publish_date\":\"2001-04-16\"}]}",resultObject.toString());
        } else {
            // unix or linux
        }

    }
    @Test
    public void taskTwoTest1() throws FileNotFoundException {
        //GIVEN
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);
        JSONPointer jsonPointer = new JSONPointer("/catalog/book/1");

        //WHEN
        Object resultObject = XML.toJSONObject(fileReader,jsonPointer);

        //THEN
        System.out.println("Next is the test two");
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Mac OS")) {
            // apple
            assertEquals("{\"author\":\"Ralls, Kim\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"A former architect battles corporate zombies,\\n            an evil sorceress, and her own childhood to become queen\\n            of the world.\",\"id\":\"bk102\",\"title\":\"Midnight Rain\",\"publish_date\":\"2000-12-16\"}",resultObject.toString());
        } else if (osName.startsWith("Windows")) {
            // windows
            assertEquals("{\"author\":\"Ralls, Kim\",\"price\":5.95,\"genre\":\"Fantasy\",\"description\":\"A former architect battles corporate zombies,\\r\\n            an evil sorceress, and her own childhood to become queen\\r\\n            of the world.\",\"id\":\"bk102\",\"title\":\"Midnight Rain\",\"publish_date\":\"2000-12-16\"}",resultObject.toString());
        } else {
            // unix or linux
        }

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

    public class addPrefix implements XML.MyTransform {
        @Override
        public String transform(String input) {
            return "swe262_" + input;
        }
    }

    //the difference of time cost between outside and inside library implementation
    //outside: 12ms
    //inside: 10ms

    @Test
    public void MileStone3TestOne() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);

//        long startTime=System.currentTimeMillis();
        JSONObject resultJsonObj = XML.toJSONObject(fileReader,new addPrefix());
//        long endTime=System.currentTimeMillis();
//        System.out.println("the time cost is "+(endTime-startTime)+"ms");

        String osName = System.getProperty("os.name");
        if (osName.startsWith("Mac OS")) {
            // apple
        } else if (osName.startsWith("Windows")) {
            // windows
            assertEquals("{\"swe262_catalog\":{\"swe262_book\":[{\"swe262_price\":44.95,\"swe262_genre\":\"Computer\",\"swe262_author\":\"Gambardella, Matthew\",\"swe262_publish_date\":\"2000-10-01\",\"swe262_title\":\"XML Developer's Guide\",\"swe262_description\":\"An in-depth look at creating applications\\r\\n            with XML.\",\"swe262_id\":\"bk101\"},{\"swe262_price\":5.95,\"swe262_genre\":\"Fantasy\",\"swe262_author\":\"Ralls, Kim\",\"swe262_publish_date\":\"2000-12-16\",\"swe262_title\":\"Midnight Rain\",\"swe262_description\":\"A former architect battles corporate zombies,\\r\\n            an evil sorceress, and her own childhood to become queen\\r\\n            of the world.\",\"swe262_id\":\"bk102\"},{\"swe262_price\":5.95,\"swe262_genre\":\"Fantasy\",\"swe262_author\":\"Corets, Eva\",\"swe262_publish_date\":\"2000-11-17\",\"swe262_title\":\"Maeve Ascendant\",\"swe262_description\":\"After the collapse of a nanotechnology\\r\\n            society in England, the young survivors lay the\\r\\n            foundation for a new society.\",\"swe262_id\":\"bk103\"},{\"swe262_price\":5.95,\"swe262_genre\":\"Fantasy\",\"swe262_author\":\"Corets, Eva\",\"swe262_publish_date\":\"2001-03-10\",\"swe262_title\":\"Oberon's Legacy\",\"swe262_description\":\"In post-apocalypse England, the mysterious\\r\\n            agent known only as Oberon helps to create a new life\\r\\n            for the inhabitants of London. Sequel to Maeve\\r\\n            Ascendant.\",\"swe262_id\":\"bk104\"},{\"swe262_price\":5.95,\"swe262_genre\":\"Fantasy\",\"swe262_author\":\"Corets, Eva\",\"swe262_publish_date\":\"2001-09-10\",\"swe262_title\":\"The Sundered Grail\",\"swe262_description\":\"The two daughters of Maeve, half-sisters,\\r\\n            battle one another for control of England. Sequel to\\r\\n            Oberon's Legacy.\",\"swe262_id\":\"bk105\"},{\"swe262_price\":4.95,\"swe262_genre\":\"Romance\",\"swe262_author\":\"Randall, Cynthia\",\"swe262_publish_date\":\"2000-09-02\",\"swe262_title\":\"Lover Birds\",\"swe262_description\":\"When Carla meets Paul at an ornithology\\r\\n            conference, tempers fly as feathers get ruffled.\",\"swe262_id\":\"bk106\"},{\"swe262_price\":4.95,\"swe262_genre\":\"Romance\",\"swe262_author\":\"Thurman, Paula\",\"swe262_publish_date\":\"2000-11-02\",\"swe262_title\":\"Splish Splash\",\"swe262_description\":\"A deep sea diver finds true love twenty\\r\\n            thousand leagues beneath the sea.\",\"swe262_id\":\"bk107\"},{\"swe262_price\":4.95,\"swe262_genre\":\"Horror\",\"swe262_author\":\"Knorr, Stefan\",\"swe262_publish_date\":\"2000-12-06\",\"swe262_title\":\"Creepy Crawlies\",\"swe262_description\":\"An anthology of horror stories about roaches,\\r\\n            centipedes, scorpions  and other insects.\",\"swe262_id\":\"bk108\"},{\"swe262_price\":6.95,\"swe262_genre\":\"Science Fiction\",\"swe262_author\":\"Kress, Peter\",\"swe262_publish_date\":\"2000-11-02\",\"swe262_title\":\"Paradox Lost\",\"swe262_description\":\"After an inadvertant trip through a Heisenberg\\r\\n            Uncertainty Device, James Salway discovers the problems\\r\\n            of being quantum.\",\"swe262_id\":\"bk109\"},{\"swe262_price\":36.95,\"swe262_genre\":\"Computer\",\"swe262_author\":\"O'Brien, Tim\",\"swe262_publish_date\":\"2000-12-09\",\"swe262_title\":\"Microsoft .NET: The Programming Bible\",\"swe262_description\":\"Microsoft's .NET initiative is explored in\\r\\n            detail in this deep programmer's reference.\",\"swe262_id\":\"bk110\"},{\"swe262_price\":36.95,\"swe262_genre\":\"Computer\",\"swe262_author\":\"O'Brien, Tim\",\"swe262_publish_date\":\"2000-12-01\",\"swe262_title\":\"MSXML3: A Comprehensive Guide\",\"swe262_description\":\"The Microsoft MSXML3 parser is covered in\\r\\n            detail, with attention to XML DOM interfaces, XSLT processing,\\r\\n            SAX and more.\",\"swe262_id\":\"bk111\"},{\"swe262_price\":49.95,\"swe262_genre\":\"Computer\",\"swe262_author\":\"Galos, Mike\",\"swe262_publish_date\":\"2001-04-16\",\"swe262_title\":\"Visual Studio 7: A Comprehensive Guide\",\"swe262_description\":\"Microsoft Visual Studio 7 is explored in depth,\\r\\n            looking at how Visual Basic, Visual C++, C#, and ASP+ are\\r\\n            integrated into a comprehensive development\\r\\n            environment.\",\"swe262_id\":\"bk112\"}]}}",resultJsonObj.toString());

        } else {
            // unix or linux
        }

    }

    public class rollOver implements XML.MyTransform {

        @Override
        public String transform(String input) {
            String output = new StringBuilder(input).reverse().toString();
            return output;
        }
    }

    @Test
    public void MileStone3TestTwo() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);

        JSONObject resultJsonObj = XML.toJSONObject(fileReader,new rollOver());

        String osName = System.getProperty("os.name");
        if (osName.startsWith("Mac OS")) {
            // apple
        } else if (osName.startsWith("Windows")) {
            // windows
            assertEquals("{\"golatac\":{\"koob\":[{\"rohtua\":\"Gambardella, Matthew\",\"ecirp\":44.95,\"di\":\"bk101\",\"erneg\":\"Computer\",\"etad_hsilbup\":\"2000-10-01\",\"eltit\":\"XML Developer's Guide\",\"noitpircsed\":\"An in-depth look at creating applications\\r\\n            with XML.\"},{\"rohtua\":\"Ralls, Kim\",\"ecirp\":5.95,\"di\":\"bk102\",\"erneg\":\"Fantasy\",\"etad_hsilbup\":\"2000-12-16\",\"eltit\":\"Midnight Rain\",\"noitpircsed\":\"A former architect battles corporate zombies,\\r\\n            an evil sorceress, and her own childhood to become queen\\r\\n            of the world.\"},{\"rohtua\":\"Corets, Eva\",\"ecirp\":5.95,\"di\":\"bk103\",\"erneg\":\"Fantasy\",\"etad_hsilbup\":\"2000-11-17\",\"eltit\":\"Maeve Ascendant\",\"noitpircsed\":\"After the collapse of a nanotechnology\\r\\n            society in England, the young survivors lay the\\r\\n            foundation for a new society.\"},{\"rohtua\":\"Corets, Eva\",\"ecirp\":5.95,\"di\":\"bk104\",\"erneg\":\"Fantasy\",\"etad_hsilbup\":\"2001-03-10\",\"eltit\":\"Oberon's Legacy\",\"noitpircsed\":\"In post-apocalypse England, the mysterious\\r\\n            agent known only as Oberon helps to create a new life\\r\\n            for the inhabitants of London. Sequel to Maeve\\r\\n            Ascendant.\"},{\"rohtua\":\"Corets, Eva\",\"ecirp\":5.95,\"di\":\"bk105\",\"erneg\":\"Fantasy\",\"etad_hsilbup\":\"2001-09-10\",\"eltit\":\"The Sundered Grail\",\"noitpircsed\":\"The two daughters of Maeve, half-sisters,\\r\\n            battle one another for control of England. Sequel to\\r\\n            Oberon's Legacy.\"},{\"rohtua\":\"Randall, Cynthia\",\"ecirp\":4.95,\"di\":\"bk106\",\"erneg\":\"Romance\",\"etad_hsilbup\":\"2000-09-02\",\"eltit\":\"Lover Birds\",\"noitpircsed\":\"When Carla meets Paul at an ornithology\\r\\n            conference, tempers fly as feathers get ruffled.\"},{\"rohtua\":\"Thurman, Paula\",\"ecirp\":4.95,\"di\":\"bk107\",\"erneg\":\"Romance\",\"etad_hsilbup\":\"2000-11-02\",\"eltit\":\"Splish Splash\",\"noitpircsed\":\"A deep sea diver finds true love twenty\\r\\n            thousand leagues beneath the sea.\"},{\"rohtua\":\"Knorr, Stefan\",\"ecirp\":4.95,\"di\":\"bk108\",\"erneg\":\"Horror\",\"etad_hsilbup\":\"2000-12-06\",\"eltit\":\"Creepy Crawlies\",\"noitpircsed\":\"An anthology of horror stories about roaches,\\r\\n            centipedes, scorpions  and other insects.\"},{\"rohtua\":\"Kress, Peter\",\"ecirp\":6.95,\"di\":\"bk109\",\"erneg\":\"Science Fiction\",\"etad_hsilbup\":\"2000-11-02\",\"eltit\":\"Paradox Lost\",\"noitpircsed\":\"After an inadvertant trip through a Heisenberg\\r\\n            Uncertainty Device, James Salway discovers the problems\\r\\n            of being quantum.\"},{\"rohtua\":\"O'Brien, Tim\",\"ecirp\":36.95,\"di\":\"bk110\",\"erneg\":\"Computer\",\"etad_hsilbup\":\"2000-12-09\",\"eltit\":\"Microsoft .NET: The Programming Bible\",\"noitpircsed\":\"Microsoft's .NET initiative is explored in\\r\\n            detail in this deep programmer's reference.\"},{\"rohtua\":\"O'Brien, Tim\",\"ecirp\":36.95,\"di\":\"bk111\",\"erneg\":\"Computer\",\"etad_hsilbup\":\"2000-12-01\",\"eltit\":\"MSXML3: A Comprehensive Guide\",\"noitpircsed\":\"The Microsoft MSXML3 parser is covered in\\r\\n            detail, with attention to XML DOM interfaces, XSLT processing,\\r\\n            SAX and more.\"},{\"rohtua\":\"Galos, Mike\",\"ecirp\":49.95,\"di\":\"bk112\",\"erneg\":\"Computer\",\"etad_hsilbup\":\"2001-04-16\",\"eltit\":\"Visual Studio 7: A Comprehensive Guide\",\"noitpircsed\":\"Microsoft Visual Studio 7 is explored in depth,\\r\\n            looking at how Visual Basic, Visual C++, C#, and ASP+ are\\r\\n            integrated into a comprehensive development\\r\\n            environment.\"}]}}",resultJsonObj.toString());
        } else {
            // unix or linux
        }

    }

    public class addSuffix implements XML.MyTransform{

        @Override
        public String transform(String input) {
            return input +"_swe262";
        }
    }

    @Test
    public void MileStone3TestThree() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);

        JSONObject resultJsonObj = XML.toJSONObject(fileReader,new addSuffix());

        String osName = System.getProperty("os.name");
        if (osName.startsWith("Mac OS")) {
            // apple
        } else if (osName.startsWith("Windows")) {
            // windows
            assertEquals("{\"catalog_swe262\":{\"book_swe262\":[{\"genre_swe262\":\"Computer\",\"description_swe262\":\"An in-depth look at creating applications\\r\\n            with XML.\",\"publish_date_swe262\":\"2000-10-01\",\"title_swe262\":\"XML Developer's Guide\",\"price_swe262\":44.95,\"author_swe262\":\"Gambardella, Matthew\",\"id_swe262\":\"bk101\"},{\"genre_swe262\":\"Fantasy\",\"description_swe262\":\"A former architect battles corporate zombies,\\r\\n            an evil sorceress, and her own childhood to become queen\\r\\n            of the world.\",\"publish_date_swe262\":\"2000-12-16\",\"title_swe262\":\"Midnight Rain\",\"price_swe262\":5.95,\"author_swe262\":\"Ralls, Kim\",\"id_swe262\":\"bk102\"},{\"genre_swe262\":\"Fantasy\",\"description_swe262\":\"After the collapse of a nanotechnology\\r\\n            society in England, the young survivors lay the\\r\\n            foundation for a new society.\",\"publish_date_swe262\":\"2000-11-17\",\"title_swe262\":\"Maeve Ascendant\",\"price_swe262\":5.95,\"author_swe262\":\"Corets, Eva\",\"id_swe262\":\"bk103\"},{\"genre_swe262\":\"Fantasy\",\"description_swe262\":\"In post-apocalypse England, the mysterious\\r\\n            agent known only as Oberon helps to create a new life\\r\\n            for the inhabitants of London. Sequel to Maeve\\r\\n            Ascendant.\",\"publish_date_swe262\":\"2001-03-10\",\"title_swe262\":\"Oberon's Legacy\",\"price_swe262\":5.95,\"author_swe262\":\"Corets, Eva\",\"id_swe262\":\"bk104\"},{\"genre_swe262\":\"Fantasy\",\"description_swe262\":\"The two daughters of Maeve, half-sisters,\\r\\n            battle one another for control of England. Sequel to\\r\\n            Oberon's Legacy.\",\"publish_date_swe262\":\"2001-09-10\",\"title_swe262\":\"The Sundered Grail\",\"price_swe262\":5.95,\"author_swe262\":\"Corets, Eva\",\"id_swe262\":\"bk105\"},{\"genre_swe262\":\"Romance\",\"description_swe262\":\"When Carla meets Paul at an ornithology\\r\\n            conference, tempers fly as feathers get ruffled.\",\"publish_date_swe262\":\"2000-09-02\",\"title_swe262\":\"Lover Birds\",\"price_swe262\":4.95,\"author_swe262\":\"Randall, Cynthia\",\"id_swe262\":\"bk106\"},{\"genre_swe262\":\"Romance\",\"description_swe262\":\"A deep sea diver finds true love twenty\\r\\n            thousand leagues beneath the sea.\",\"publish_date_swe262\":\"2000-11-02\",\"title_swe262\":\"Splish Splash\",\"price_swe262\":4.95,\"author_swe262\":\"Thurman, Paula\",\"id_swe262\":\"bk107\"},{\"genre_swe262\":\"Horror\",\"description_swe262\":\"An anthology of horror stories about roaches,\\r\\n            centipedes, scorpions  and other insects.\",\"publish_date_swe262\":\"2000-12-06\",\"title_swe262\":\"Creepy Crawlies\",\"price_swe262\":4.95,\"author_swe262\":\"Knorr, Stefan\",\"id_swe262\":\"bk108\"},{\"genre_swe262\":\"Science Fiction\",\"description_swe262\":\"After an inadvertant trip through a Heisenberg\\r\\n            Uncertainty Device, James Salway discovers the problems\\r\\n            of being quantum.\",\"publish_date_swe262\":\"2000-11-02\",\"title_swe262\":\"Paradox Lost\",\"price_swe262\":6.95,\"author_swe262\":\"Kress, Peter\",\"id_swe262\":\"bk109\"},{\"genre_swe262\":\"Computer\",\"description_swe262\":\"Microsoft's .NET initiative is explored in\\r\\n            detail in this deep programmer's reference.\",\"publish_date_swe262\":\"2000-12-09\",\"title_swe262\":\"Microsoft .NET: The Programming Bible\",\"price_swe262\":36.95,\"author_swe262\":\"O'Brien, Tim\",\"id_swe262\":\"bk110\"},{\"genre_swe262\":\"Computer\",\"description_swe262\":\"The Microsoft MSXML3 parser is covered in\\r\\n            detail, with attention to XML DOM interfaces, XSLT processing,\\r\\n            SAX and more.\",\"publish_date_swe262\":\"2000-12-01\",\"title_swe262\":\"MSXML3: A Comprehensive Guide\",\"price_swe262\":36.95,\"author_swe262\":\"O'Brien, Tim\",\"id_swe262\":\"bk111\"},{\"genre_swe262\":\"Computer\",\"description_swe262\":\"Microsoft Visual Studio 7 is explored in depth,\\r\\n            looking at how Visual Basic, Visual C++, C#, and ASP+ are\\r\\n            integrated into a comprehensive development\\r\\n            environment.\",\"publish_date_swe262\":\"2001-04-16\",\"title_swe262\":\"Visual Studio 7: A Comprehensive Guide\",\"price_swe262\":49.95,\"author_swe262\":\"Galos, Mike\",\"id_swe262\":\"bk112\"}]}}",resultJsonObj.toString());
        } else {
            // unix or linux
        }
    }
}
