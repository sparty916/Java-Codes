/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pje2
 */
import java.util.*;


public class DoubleTest{
  public static void main(String [] args){
      
     List <Integer> list = new ArrayList <Integer> ();
     Set <Integer> set = new HashSet <Integer> ();
     Integer intObject;
     for(int i = 0; i < 100; ++i){
          intObject = new Integer ((int)(Math.random() * 10 + 1));
          list.add(intObject);
          set.add(intObject);
     }
     System.out.println("List size = " + list.size()); 
     System.out.println("List = " + list);
     System.out.println("Set size = " + set.size());
     System.out.println("Set = " + set);
    
    //List <Integer> list = new LinkedList <Integer>();
    //Set <Integer> set = new HashSet <Integer>();

    for(int i = 0; i < 10; i++){

      list.add(i + 1);
      set.add(i + 1);
    }

    System.out.println("Set Size = " + set.size());
    System.out.println("List Size = " + list.size() + "\n");

    for(int i = 0; i < 10; i++){

      list.add(i + 1);
      set.add(i + 1);
    }

    System.out.println("Set Size = " + set.size());
    System.out.println("List Size = " + list.size() + "\n");

    for(int i = 0; i < 10; i++){

      list.add(i + 1);
      set.add(i + 1);
    }

    System.out.println("Set Size = " + set.size());
    System.out.println("List Size = " + list.size() + "\n");
  }
}
