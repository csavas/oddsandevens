//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn Savas

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
 private Set<Integer> odds;
 private Set<Integer> evens;

 public OddEvenSets()
 {
   odds = new TreeSet<Integer>();
   evens = new TreeSet<Integer>();
 }

 public OddEvenSets(String line)
 {
   odds = new TreeSet<Integer>();
   evens = new TreeSet<Integer>();
   for(String i : line.split(" ")){
     int x = Integer.parseInt(i);
     if(x%2 ==0)
       evens.add(x);
     else
       odds.add(x);
   }
 }

 public String toString()
 {
  return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
 }
}