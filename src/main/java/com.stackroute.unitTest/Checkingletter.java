// program for counting a letter

package com.stackroute.unitTest;

import java.util.HashMap;
import java.util.Map;

public class Checkingletter {
    public Map<String, Boolean> check(String[] str) {
        Map<String, Boolean> result = new HashMap<String, Boolean>();
        int count = 1;
        for (String s : str) {
            if (!result.containsKey(s))

                result.put(s, false);

            else {
                count++;
                if (count > 1)
                    result.put(s, true);
                else
                    result.put(s, false);
            }
        }
        return result;
    }
}
