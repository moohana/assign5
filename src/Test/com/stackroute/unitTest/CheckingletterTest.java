package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CheckingletterTest {
       Checkingletter cl;
    @Before
    public void setUp() throws Exception {
        cl=new Checkingletter();
    }

    @After
    public void tearDown() throws Exception {
        cl=null;
    }

    @Test
    public void check() {
        String[] arr={"a","a","a","g","b","i","i"};
        Map<String, Boolean> result = new HashMap<String, Boolean>();
        result.put("a",true);
        result.put("i",true);
        result.put("g",false);
        result.put("b",false);
        assertEquals(result,cl.check(arr));
    }
    public void check1() {
        String[] arr={"a","a","a","g","b","i","i"};
        Map<String, Boolean> result = new HashMap<String, Boolean>();
        result.put("a",true);
        result.put("i",true);
        result.put("g",false);
        result.put("b",true);
        assertNotEquals(result,cl.check(arr));
    }
    public void check2() {
        String[] arr={"a","a","a","g","b","i","i"};
        Map<String, Boolean> result = new HashMap<String, Boolean>();
        result.put("a",true);
        result.put("i",true);
        result.put("g",true);
        result.put("b",true);
        assertNotEquals(result,cl.check(arr));
    }
    public void check3() {
        String[] arr={"a","a","a","g","b","i","i"};
        Map<String, Boolean> result = new HashMap<String, Boolean>();
        result.put("a",false);
        result.put("i",true);
        result.put("g",false);
        result.put("b",true);
        assertNotEquals(result,cl.check(arr));
    }
}