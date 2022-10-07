package bai3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzBuzzTranslate {

    @Test
    @DisplayName("3 to Fizz")
    void testFizz(){
        String expected = "Fizz";
        String result = FizzBuzz.translate(3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("5 to Buzz")
    void testBuzz(){
        String expected = "Buzz";
        String result = FizzBuzz.translate(5);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("15 to FizzBuzz")
    void testFizzBuzz(){
        String expected = "FizzBuzz";
        String result = FizzBuzz.translate(15);
        assertEquals(expected,result);
    }
}
