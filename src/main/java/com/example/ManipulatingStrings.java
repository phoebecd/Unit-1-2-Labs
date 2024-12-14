package com.example;
import java.util.Scanner;

// Give students a specified input and outputh they're supposed to get
public class ManipulatingStrings
{
    //ManipulatingStrings manipulator = new ManipulatingStrings();
    String phrase = new String ("cupcakes"); 
    int phraseLength = phrase.length();
    int middleIndex = phraseLength/2;
    String firstHalf;
    String secondHalf;
    public static void main (String[] args)
    {
        
               

    }

    public String findMiddle3() {
        String middle3 = ""; 
        //phraseLength = p.length();
        //middleIndex = phraseLength/2;
        middle3 = phrase.substring(middleIndex-1, middleIndex+2);
        return middle3;
    }

    public String switchPhrase() {
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        String switchedPhrase = secondHalf.concat(firstHalf);
        return switchedPhrase;
    }
}