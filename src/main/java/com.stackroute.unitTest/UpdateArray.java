//program for updating a array

package com.stackroute.unitTest;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;
import java.util.*;


public class UpdateArray {

    public ArrayList<String> checkupdatearray(String string,int n,ArrayList<String> al_in)throws ArrayIndexOutOfBoundsException {
        ArrayList<String> al_out=al_in;
        al_out.set(n,string);
        return al_out;
    }
}
