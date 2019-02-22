//program for sorting array of string

package com.stackroute.unitTest;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class Sorting {
    public ArrayList<String> sorter(String[] indata){
        Set<String> set = new HashSet<String>();
        for(String s:indata)
            set.add(s);
        TreeSet <String> sortedSet = new TreeSet<String>();
             sortedSet.addAll(set);

        ArrayList<String> list=new ArrayList<String>(sortedSet);
        return list;

    }
}
