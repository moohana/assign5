package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class UpdateArrayTest {
    UpdateArray ua;

    @Before
    public void setUp() throws Exception {
        ua=new UpdateArray();
    }

    @After
    public void tearDown() throws Exception {
        ua=null;
    }


    @Test
    public void checkupdatearray() {
        ArrayList<String> al_in = new ArrayList<String>() {
            {
                add("apple");
                add("banana");
            }
        };

        ArrayList<String> al_out = new ArrayList<String>() {
            {
                add("cat");
                add("banana");
            }
        };

        assertEquals(al_out,ua.checkupdatearray("cat",0,al_in) );


    }

}