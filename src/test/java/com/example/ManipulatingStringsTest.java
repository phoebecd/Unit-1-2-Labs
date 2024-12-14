package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

//import java.util.List;

public class ManipulatingStringsTest {
    private ManipulatingStrings main = new ManipulatingStrings();

    @BeforeEach
    public void setUp() {
        main = new ManipulatingStrings();
    }
  
    @Test
    public void testMiddle3() {
        ManipulatingStrings main = new ManipulatingStrings();
        assertEquals("cak", main.findMiddle3(), "Error calculating middle 3 characters.");
       // assertEquals("and", main.findMiddle3("candy"), "Error calculating middle 3 characters.");
    }

    @Test
    public void testSwitchPhrase() {
        ManipulatingStrings main = new ManipulatingStrings();
        assertEquals("akescupc", main.switchPhrase(), "Error switching first and second half.");
        //assertEquals("ndyca", main.switchPhrase("candy"), "Error switching first and second half.");
    }



}