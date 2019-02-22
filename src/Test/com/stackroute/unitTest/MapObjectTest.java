package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;

public class MapObjectTest {
        MapObject map;
    @Before
    public void setUp() throws Exception {
        map=new MapObject();
    }

    @After
    public void tearDown() throws Exception {
        map=null;
    }

    @Test
    public void mapValueModify() {
        Map value=new LinkedHashMap();
        value.put("val1","Java");
        value.put("val2","C++");

        Map modify=new LinkedHashMap();
        modify.put("val1","");
        modify.put("val2","Java");

        assertEquals(modify,map.mapValueModify(value));

        value.clear();
        modify.clear();

        value.put("val1","Java");
        value.put("val2","C++");


        modify.put("1","");
        modify.put("2","Java");

        assertNotEquals(modify,map.mapValueModify(value));


    }
}

