package _8_1_java8.hw_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SmallLettersTest {

    @Test
    public void max() {
        List empty = Arrays.asList("");
        List nullList = Arrays.asList();
        List text1 = Arrays.asList("GOEORJO","GRG93895&(^$&","\n   []","Русский ","Текст");
        List text2 = Arrays.asList("KBkekekk","fiewfbiue","siefhihierhghweogwerhgo");

        Assert.assertTrue(SmallLetters.max(empty).isPresent());
        Assert.assertFalse(SmallLetters.max(nullList).isPresent());
        Assert.assertEquals(SmallLetters.max(text1).get(),"Русский ");
        Assert.assertEquals(SmallLetters.max(text2).get(),"siefhihierhghweogwerhgo");

    }
}