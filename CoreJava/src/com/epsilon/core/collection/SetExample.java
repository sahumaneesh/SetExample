package com.epsilon.core.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
  public static void main(String args[]) { 
     int count[] = {34, 22,10,60,30,22};
     Set<Integer> set = new HashSet<Integer>();
     try{
        for(int i = 0; i<5; i++){
           set.add(count[i]);
        }
        System.out.println("Initial Set=" + set);        

        set.remove(30);        
        System.out.println("Values after delete=" + set);
        System.out.println("------------");
        System.out.println("Retrieving Values");        
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
        	System.out.println(iterator.next());
            System.out.println("------------");

        }     

     }
     catch(Exception e){}
  }
}