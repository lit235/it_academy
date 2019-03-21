package _4_collections.hw_2;

import org.junit.Assert;
import org.junit.Test;


import java.util.Map;
import java.util.TreeMap;



public class UtilWordTest {

    @Test
    public void getMapWord() {
        String emptuString = "";
        String notWords = "1334,.,..////     ??/";
        String singleWords = "wer?/vvr ihiei.";
        String doubleWords = "ihiei \nwer?wer/vvr ihiei.vvr";

        Map<String, Integer> emptuMap = new TreeMap<>();
        Map<String, Integer> singleWordsMap = new TreeMap<String, Integer>() {{
            put("wer", 1);
            put("vvr", 1);
            put("ihiei", 1);
        }};
        Map<String, Integer> doubleWordsMap = new TreeMap<String, Integer>() {{
            put("wer", 2);
            put("vvr", 2);
            put("ihiei", 2);
        }};


        Assert.assertEquals(new UtilWord(emptuString).getMapWord(), emptuMap);
        Assert.assertEquals(new UtilWord(notWords).getMapWord(), emptuMap);
        Assert.assertEquals(new UtilWord(singleWords).getMapWord(), singleWordsMap);
        Assert.assertEquals(new UtilWord(doubleWords).getMapWord(), doubleWordsMap);

    }
}