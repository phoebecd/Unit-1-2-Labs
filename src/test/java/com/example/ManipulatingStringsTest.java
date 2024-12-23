package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

public class ManipulatingStringsTest {
    private ManipulatingStrings main = new ManipulatingStrings();
  
    @Test
    public void testMiddle3() {
        ManipulatingStrings main = new ManipulatingStrings();
        assertEquals("ryt", main.findMiddle3("Tarrytown"), "Error calculating middle 3 characters.");
        assertEquals(" Yo", main.findMiddle3("New York"), "Error calculating middle 3 characters.");
    }

    @Test
    public void testSwitchPhrase() {
        ManipulatingStrings main = new ManipulatingStrings();
        assertEquals("ytownTarr", main.switchPhrase("Tarrytown"), "Error switching first and second half.");
        assertEquals("YorkNew ", main.switchPhrase("New York"), "Error switching first and second half.");
    }

    @Test
    public void testReplaceBlanks() {
        ManipulatingStrings main = new ManipulatingStrings();
        assertEquals("CS*ClassHello*AP", main.replaceBlanks("Hello APCS Class"), "Error replacing blanks with asterisks.");
        assertEquals("YorkNew*", main.replaceBlanks("New York"), "Error replacing blanks with asterisks.");
    }

    @Test
    public void testPrintPhraseInfo() throws Exception {
        String text = tapSystemOut(() -> {
            main.printPhraseInfo("This is a String test.");
        });
        String expectedOutput = "\nOriginal phrase: This is a String test.\nLength of the phrase: 22\nIndex of the middle: 11\nCharacter at the middle index: t\nSwitched phrase: tring*test.This*is*a*S\nMiddle 3: Str\n\n";
        assertEquals(expectedOutput, text);
    }

    @Test
    public void testMainMethod() throws Exception {
        String input = "Tarrytown\nNY\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String text = tapSystemOut(() -> {
            ManipulatingStrings.main(new String[]{});
        });
        String expectedOutput = "Enter your city\n" + //
                        "Enter your state\n" + //
                        "NYtarrytownNY\n" + //
                        "\nOriginal phrase: This is a String test.\nLength of the phrase: 22\nIndex of the middle: 11\nCharacter at the middle index: t\nSwitched phrase: tring*test.This*is*a*S\nMiddle 3: Str\n\n";
        assertEquals(expectedOutput, text);
    }
}