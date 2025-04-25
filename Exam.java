import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class Exam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exam
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Exam
     */
    public Exam()
    {
        // initialise instance variables
        x = 0;
        int fevers= 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sampleMethod(int y)
    {
        // Q24
        // a declare and assign values to two string valuables
        //b test if they're equal
        //c produce different outputs if theyre equal or not
        
        
        //a
        String string1 = "hello";
        String string2 = "hello";

        if (string1.equals(string2)) {//b
           //c 
          System.out.println("The strings are equal.");
        } else {
         System.out.println("The strings are not equal.");
        }

    }
    
    public static void main(String[] args) {
         //Q25
        //write a method that receives an arraylist of temperatures as parameter 
        //and outputs how many of them refer to a conidition of fever
        //(greater than 37.5), and what was the maximum of all reported temperatures
        ArrayList<Double> temp = new ArrayList<>();
        
        // Adding elements
        temp.add(40.1);
        temp.add(38.2);
        temp.add(32.3);
        
        analyzeTemp(temp);
       
        
    }

    public static void analyzeTemp(ArrayList<Double> temps)
    {
        //Q25P2
       int fevers=0;
       double maxTemp= Double.NEGATIVE_INFINITY;
       
       for (double temp : temps)
       {
        if (temp>37.5){
            fevers++;
        }
        if (temp>maxTemp){
            maxTemp=temp;
        }
        }
        System.out.println("Number of fevers over 37.5 degrees"+fevers);
        System.out.println("Highest temperature reports"+maxTemp);
    }
    
    public static void tempLoop(ArrayList<Double> temps)
    {
        //q26
        //output the max value with a loop if i already used collections.max
    // same thing but you return the collections.Max
    System.out.println("Max value is:"+ Collections.max(temps));
    }
    
    public void termpSort()
    {
        //Q27
        //output the max temp after using collections.sort
        //Return the final index of the arrayList after calling collections.sort
    }
    
    public void wow()
    {
        
    }
}
