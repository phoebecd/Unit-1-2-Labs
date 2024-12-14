package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ManipulatingStringsTest {
    String phrase = new String ("This is a String test.");
    int phraseLength;   // number of characters in the phrase String
    int middleIndex;    // index of the middle character in the String
    String firstHalf;   // first half of the phrase String
    String secondHalf;  // second half of the phrase String
    String switchedPhrase; // a new phrase with original halves switched
    String middle3;        // stores the middle three characters of the String
    String city;
    String state;

  
    @Test
    public void testMiddle3() {
        ManipulatingStrings main = new ManipulatingStrings();
        assertEquals("cak", main.findMiddle3("cupcakes"), "Error calculating middle 3 characters.");
        assertEquals("and", main.findMiddle3("candy"), "Error calculating middle 3 characters.");
    }

}