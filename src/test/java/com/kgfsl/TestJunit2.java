package com.kgfsl;

// import org.junit.Test;
// //import org.junit.Ignore;
// import static org.junit.Assert.assertEquals;
// import org.junit.gen5.api.Test;
// import static org.junit.gen5.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestJunit2 {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}