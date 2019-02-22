//program for counting words

package com.stackroute.unitTest;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.*;
import java.lang.String;
import java.lang.Integer;
public class CountWords {
    public Map<String, Integer> checkcounting(String string) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        string = string.toLowerCase();
        String[] arr = string.split("[\\W+]");
        for (String word : arr) {
            if (!result.containsKey(word))
                result.put(word, 1);
            else {
                int count = result.get(word);
                result.put(word, count + 1);
            }
        }
        return result;
    }
}



