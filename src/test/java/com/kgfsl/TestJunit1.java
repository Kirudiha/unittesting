package com.kgfsl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// import org.junit.gen5.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;

// import static org.junit.gen5.api.Assertions.assertEquals;
// import org.junit.Test;
// //import org.junit.Ignore;
// import static org.junit.Assert.assertEquals;

public class TestJunit1 {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());

    }

    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "malayalam","madam","able was I ere I saw elba" })
    void palindromes(String candidate) {
        assertTrue(isPalindrome(candidate));
    }

    private void assertTrue(Object palindrome) {
    }

    private Object isPalindrome(String candidate) {
        System.out.println(candidate);
        return null;
    }
}