//program for using map object key value pair

package com.stackroute.unitTest;

import java.util.Map;
import java.util.*;

public class MapObject {
    public Map mapValueModify(Map value)
    {
        Set set = value.keySet();

        Object[] objects = new Object[2];
        int i=0;


        Iterator itr = set.iterator();
        while (itr.hasNext()){
            objects[i]=itr.next();
            i++;
        }

        Object newValue = value.get(objects[0]);
        value.put(objects[0],"");
        value.put(objects[1],newValue);


        return value;

    }
}


