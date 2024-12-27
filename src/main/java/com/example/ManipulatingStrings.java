package com.example;
import java.util.Scanner;

public class ManipulatingStrings
{
    int phraseLength;
    int middleIndex;
    
    public static void main (String[] args)
    {
        ManipulatingStrings manipulator = new ManipulatingStrings();
        manipulator.printPhraseInfo("Florida");          
    }

    public String findMiddle3(String p) {
        String middle3 = ""; 
        return middle3;
    }

    public String switchPhrase(String p) {
        findMiddle3(p);
        String firstHalf = "";
        String secondHalf = "";
        String switchedPhrase = secondHalf.concat(firstHalf);
        return switchedPhrase;
    }

    public String replaceBlanks(String p) {
        findMiddle3(p);
        String switchedPhrase = "";
        return switchedPhrase;
    }

    public void printPhraseInfo(String p) {
        findMiddle3(p);
        System.out.println();
        System.out.println("Original phrase: ");
        System.out.println("Length of the phrase: ");
        System.out.println("Index of the middle: ");
        System.out.println("Character at the middle index: ");
        System.out.println("Switched phrase: ");
        System.out.println("Middle 3: ");
        System.out.println();
    }
}