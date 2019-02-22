package com.stackroute.unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting sort;

    @Before
    public void setUp() throws Exception {
        sort = new Sorting();
    }

    @After
    public void tearDown() throws Exception {
        sort = null;
    }

    @Test
    public void sorter() {
        String[] str={"Harry","olive","Alice","Bluto","Eugene"};
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("Alice","Bluto","Eugene","Harry","olive"));
        assertEquals(expected,sort.sorter(str));
    }
    public void sorter1() {
        String[] str={"Harry","olive","Alice","Bluto","Eugene"};
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("Alice","olive","Eugene","Harry","Bluto"));
        assertNotEquals(expected,sort.sorter(str));
    }

}
