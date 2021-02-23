package org.json.junit;

import org.json.JSONObject;
import org.json.LeafNode;
import org.json.XML;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/*
gradle configuration bug: https://www.cnblogs.com/badaoliumangqizhi/p/13672787.html
need to set java compiler version to 8: https://www.pianshen.com/article/10281496279/
add something into build.gradle: sourceCompatibility = 1.8 targetCompatibility = 1.8
 */
public class Milestone4 {

    //Stream Sample:
    //obj.toStream().forEach(node -> do some transformation, possibly based on the path of the node);
    //List<String> titles = obj.toStream().map(node -> extract value for key "title").collect(Collectors.toList());
    //obj.toStream().filter(node -> node with certain properties).forEach(node -> do some transformation);


    /*
    test the validity of toStream method
     */
    @Test
    public void test1() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);

        JSONObject resultObject = XML.toJSONObject(fileReader);
        List<LeafNode> nodeList = resultObject.toStream();
        String result = "";
        for(int i = 0; i < nodeList.size(); i++){
            result += nodeList.get(i).toString();
        }
        assertEquals("LeafNode{key='author', value='Gambardella, Matthew'}LeafNode{key='price', value='44.95'}LeafNode{key='genre', value='Computer'}LeafNode{key='description', value='An in-depth look at creating applications\n" +
                "            with XML.'}LeafNode{key='id', value='bk101'}LeafNode{key='title', value='XML Developer's Guide'}LeafNode{key='publish_date', value='2000-10-01'}LeafNode{key='author', value='Ralls, Kim'}LeafNode{key='price', value='5.95'}LeafNode{key='genre', value='Fantasy'}LeafNode{key='description', value='A former architect battles corporate zombies,\n" +
                "            an evil sorceress, and her own childhood to become queen\n" +
                "            of the world.'}LeafNode{key='id', value='bk102'}LeafNode{key='title', value='Midnight Rain'}LeafNode{key='publish_date', value='2000-12-16'}LeafNode{key='author', value='Corets, Eva'}LeafNode{key='price', value='5.95'}LeafNode{key='genre', value='Fantasy'}LeafNode{key='description', value='After the collapse of a nanotechnology\n" +
                "            society in England, the young survivors lay the\n" +
                "            foundation for a new society.'}LeafNode{key='id', value='bk103'}LeafNode{key='title', value='Maeve Ascendant'}LeafNode{key='publish_date', value='2000-11-17'}LeafNode{key='author', value='Corets, Eva'}LeafNode{key='price', value='5.95'}LeafNode{key='genre', value='Fantasy'}LeafNode{key='description', value='In post-apocalypse England, the mysterious\n" +
                "            agent known only as Oberon helps to create a new life\n" +
                "            for the inhabitants of London. Sequel to Maeve\n" +
                "            Ascendant.'}LeafNode{key='id', value='bk104'}LeafNode{key='title', value='Oberon's Legacy'}LeafNode{key='publish_date', value='2001-03-10'}LeafNode{key='author', value='Corets, Eva'}LeafNode{key='price', value='5.95'}LeafNode{key='genre', value='Fantasy'}LeafNode{key='description', value='The two daughters of Maeve, half-sisters,\n" +
                "            battle one another for control of England. Sequel to\n" +
                "            Oberon's Legacy.'}LeafNode{key='id', value='bk105'}LeafNode{key='title', value='The Sundered Grail'}LeafNode{key='publish_date', value='2001-09-10'}LeafNode{key='author', value='Randall, Cynthia'}LeafNode{key='price', value='4.95'}LeafNode{key='genre', value='Romance'}LeafNode{key='description', value='When Carla meets Paul at an ornithology\n" +
                "            conference, tempers fly as feathers get ruffled.'}LeafNode{key='id', value='bk106'}LeafNode{key='title', value='Lover Birds'}LeafNode{key='publish_date', value='2000-09-02'}LeafNode{key='author', value='Thurman, Paula'}LeafNode{key='price', value='4.95'}LeafNode{key='genre', value='Romance'}LeafNode{key='description', value='A deep sea diver finds true love twenty\n" +
                "            thousand leagues beneath the sea.'}LeafNode{key='id', value='bk107'}LeafNode{key='title', value='Splish Splash'}LeafNode{key='publish_date', value='2000-11-02'}LeafNode{key='author', value='Knorr, Stefan'}LeafNode{key='price', value='4.95'}LeafNode{key='genre', value='Horror'}LeafNode{key='description', value='An anthology of horror stories about roaches,\n" +
                "            centipedes, scorpions  and other insects.'}LeafNode{key='id', value='bk108'}LeafNode{key='title', value='Creepy Crawlies'}LeafNode{key='publish_date', value='2000-12-06'}LeafNode{key='author', value='Kress, Peter'}LeafNode{key='price', value='6.95'}LeafNode{key='genre', value='Science Fiction'}LeafNode{key='description', value='After an inadvertant trip through a Heisenberg\n" +
                "            Uncertainty Device, James Salway discovers the problems\n" +
                "            of being quantum.'}LeafNode{key='id', value='bk109'}LeafNode{key='title', value='Paradox Lost'}LeafNode{key='publish_date', value='2000-11-02'}LeafNode{key='author', value='O'Brien, Tim'}LeafNode{key='price', value='36.95'}LeafNode{key='genre', value='Computer'}LeafNode{key='description', value='Microsoft's .NET initiative is explored in\n" +
                "            detail in this deep programmer's reference.'}LeafNode{key='id', value='bk110'}LeafNode{key='title', value='Microsoft .NET: The Programming Bible'}LeafNode{key='publish_date', value='2000-12-09'}LeafNode{key='author', value='O'Brien, Tim'}LeafNode{key='price', value='36.95'}LeafNode{key='genre', value='Computer'}LeafNode{key='description', value='The Microsoft MSXML3 parser is covered in\n" +
                "            detail, with attention to XML DOM interfaces, XSLT processing,\n" +
                "            SAX and more.'}LeafNode{key='id', value='bk111'}LeafNode{key='title', value='MSXML3: A Comprehensive Guide'}LeafNode{key='publish_date', value='2000-12-01'}LeafNode{key='author', value='Galos, Mike'}LeafNode{key='price', value='49.95'}LeafNode{key='genre', value='Computer'}LeafNode{key='description', value='Microsoft Visual Studio 7 is explored in depth,\n" +
                "            looking at how Visual Basic, Visual C++, C#, and ASP+ are\n" +
                "            integrated into a comprehensive development\n" +
                "            environment.'}LeafNode{key='id', value='bk112'}LeafNode{key='title', value='Visual Studio 7: A Comprehensive Guide'}LeafNode{key='publish_date', value='2001-04-16'}",result);
    }

    /*
    select all leaf node that key contains "author"
     */
    @Test
    public void test2() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);

        JSONObject resultObject = XML.toJSONObject(fileReader);
        resultObject.toStream().forEach(node -> {
            if(node.getKey().contains("author")) System.out.println(node.toString());
        });

    }

    /*
    add suffix to every key of all leaf nodes
     */
    @Test
    public void test3() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);

        JSONObject resultObject = XML.toJSONObject(fileReader);
        List<LeafNode> nodeList = resultObject.toStream();
        List<LeafNode> afterTransList = nodeList.stream().map(node -> new LeafNode(node.getKey() + "_SWE262P", node.getKey())).distinct().collect(Collectors.toList());
        for(int i = 0; i < afterTransList.size(); i++){
            System.out.println(afterTransList.get(i));
        }
    }

    /*
    get the count of all leaf node which key contain "price" and value > 30
     */
    @Test
    public void test4() throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        String fileName = "books.xml";
        String filePath = root + "/src/test/java/org/json/junit/xmls/"+fileName;
        FileReader fileReader = new FileReader(filePath);

        JSONObject resultObject = XML.toJSONObject(fileReader);
        List<LeafNode> nodeList = resultObject.toStream();
        long count = nodeList.stream().filter(node -> node.getKey().equals("price") && Double.valueOf(node.getValue()) > 30).count();
        assertEquals(count, 4);
    }
}
