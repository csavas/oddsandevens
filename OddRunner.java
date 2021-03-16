//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn Savas

import java.io.File;
import java.util.Set;
import java.util.TreeSet;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
 public static void main( String args[] ) throws IOException
 {
  //more test cases
  Scanner data = new Scanner(new File("oddevent.dat")); 
  String nums = "";
  OddEvenSets test = new OddEvenSets();
  if(data.hasNextLine()){
    nums = data.nextLine();
    test = new OddEvenSets(nums);
  }
  
  System.out.println(test);
 }
}