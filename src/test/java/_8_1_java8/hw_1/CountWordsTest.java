package _8_1_java8.hw_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.stream.Stream;

public class CountWordsTest {

    @Test
    public void count() {
        Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");
        Stream<String> empty = Stream.of();
        Stream<String> emptyString = Stream.of("");

        HashMap <String,Integer> emptyMap= new HashMap<>();
        HashMap <String,Integer> emptyStringMap= new HashMap<>();
        emptyStringMap.put("",1);
        HashMap <String,Integer> namesMap= new HashMap<>();
        namesMap.put("John",3);
        namesMap.put("Paul",2);
        namesMap.put("George",1);

        Assert.assertEquals(CountWords.count(names),namesMap);
        Assert.assertEquals(CountWords.count(empty),emptyMap);
        Assert.assertEquals(CountWords.count(emptyString),emptyStringMap);
    }
}