//creating class for Maintest for compatating student id
package com.stackroute.unitTest;
import java.util.*;

public class MainTest {
    public List afterComparision(List student){
        StudentSorter so = new StudentSorter();
        Collections.sort(student,so);
        return student;
    }
}