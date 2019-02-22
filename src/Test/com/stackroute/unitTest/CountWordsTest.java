package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountWordsTest {
    CountWords wd;

    @Before
    public void setUp() throws Exception {
        wd=new CountWords();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkcounting() {
        Map<String, Integer> test = new HashMap<String, Integer>();
        test.put("one",3);
        test.put("two",3);
        test.put("three",2);
        assertNotEquals(test,wd.checkcounting("one/one+two*three three[two=one"));
    }
    @Test
    public void checkcounting1() {
        Map<String, Integer> test = new HashMap<String, Integer>();
        test.put("one",3);
        test.put("two",5);
        test.put("three",2);
        assertNotEquals(test,wd.checkcounting("one/one+two*three three[two=one"));
    }
    @Test
    public void checkcounting2() {
        Map<String, Integer> test = new HashMap<String, Integer>();
        test.put("one",3);
        test.put("two",5);
        test.put("three",1);
        assertNotEquals(test,wd.checkcounting("one/one+two*three three[two=one"));
    }
    @Test
    public void checkcounting3() {
        Map<String, Integer> test = new HashMap<String, Integer>();
        test.put("one",3);
        test.put("two",2);
        test.put("three",2);
        assertEquals(test,wd.checkcounting("one/one+two*three three[two=one"));
    }


}