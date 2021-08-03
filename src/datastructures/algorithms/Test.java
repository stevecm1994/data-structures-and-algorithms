package datastructures.algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        
        // Create a new HashSet of String objects
        HashSet<String> setOfStrs1 = new HashSet<>();
        
        // Adding elements in HashSet
        setOfStrs1.add("hello");
        setOfStrs1.add("Abc");
        setOfStrs1.add("time");
        setOfStrs1.add("Hi");

        
        System.out.println("setOfStrs1 = " + setOfStrs1);
        
        // Create a new HashSet of String objects
        HashSet<String> setOfStrs2 = new HashSet<>();
        
        // Adding elements in HashSet
        setOfStrs2.add("this");
        setOfStrs2.add("that");
        setOfStrs2.add("there");
        setOfStrs2.add("Hi");
    
        System.out.println("setOfStrs2 = " + setOfStrs2);
        // Merge Set 2 in Set 1
        boolean bResult = setOfStrs1.addAll(setOfStrs2);
        
        List<String> list = new ArrayList<String>(setOfStrs1);
        
        Collections.sort(list);
        
        list.remove("time");
        list.add(0, "time");
                
        if(bResult)
        {
            System.out.println("Merging of Set 1 & Set 2 Successfull");
        }
        
        System.out.println("setOfStrs1 = " + setOfStrs1);
        
        System.out.println("Sorted = " + list);
        
        
        list.add("test");
        
        setOfStrs1.addAll(list);
        
        System.out.println("Testing setOfStrs1 = " + setOfStrs1);
        
    }
}