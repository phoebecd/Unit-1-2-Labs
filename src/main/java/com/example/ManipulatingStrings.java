package com.example;
import java.util.Scanner;

// Give students a specified input and outputh they're supposed to get
public class ManipulatingStrings
{
    int phraseLength;
    int middleIndex;
    
        public static void main (String[] args)
        {
        ManipulatingStrings manipulator = new ManipulatingStrings();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println(state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
  
        manipulator.printPhraseInfo("This is a String test.");          
    }

    public String findMiddle3(String p) {
        String middle3 = ""; 
        phraseLength = p.length();
        middleIndex = phraseLength/2;
        middle3 = p.substring(middleIndex-1, middleIndex+2);
        return middle3;
    }

    public String switchPhrase(String p) {
        findMiddle3(p);
        String firstHalf = p.substring(0,middleIndex);
        String secondHalf = p.substring(middleIndex, phraseLength);
        String switchedPhrase = secondHalf.concat(firstHalf);
        return switchedPhrase;
    }

    public String replaceBlanks(String p) {
        findMiddle3(p);
        String switchedPhrase = switchPhrase(p).replace(" ", "*");
        return switchedPhrase;
    }

    public void printPhraseInfo(String p) {
        findMiddle3(p);
        System.out.println();
        System.out.println("Original phrase: " + p);
        System.out.println("Length of the phrase: " + phraseLength);
        System.out.println("Index of the middle: " + middleIndex);
        System.out.println("Character at the middle index: " + p.charAt(middleIndex));
        System.out.println("Switched phrase: " + replaceBlanks(p));
        System.out.println("Middle 3: " + findMiddle3(p));
        System.out.println();
    }
}