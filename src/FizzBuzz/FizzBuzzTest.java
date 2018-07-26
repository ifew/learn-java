package FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void When_Say_1_Should_Be_Display_1() {
        String result = fizzBuzz.Say(1);
        assertEquals("1", result);
    }
    
    @Test
    public void When_Say_2_Should_Be_Display_2() {
        String result = fizzBuzz.Say(2);
        assertEquals("2", result);
    }
    
    @Test
    public void When_Say_3_Should_Be_Display_Fizz() {
        String result = fizzBuzz.Say(3);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void When_Say_4_Should_Be_Display_4() {
        String result = fizzBuzz.Say(4);
        assertEquals("4", result);
    }
    
    @Test
    public void When_Say_5_Should_Be_Display_Buzz() {
        String result = fizzBuzz.Say(5);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void When_Say_6_Should_Be_Display_Fizz() {
        String result = fizzBuzz.Say(6);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void When_Say_7_Should_Be_Display_7() {
        String result = fizzBuzz.Say(7);
        assertEquals("7", result);
    }
    
    @Test
    public void When_Say_8_Should_Be_Display_8() {
        String result = fizzBuzz.Say(8);
        assertEquals("8", result);
    }
    
    @Test
    public void When_Say_9_Should_Be_Display_Fizz() {
        String result = fizzBuzz.Say(9);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void When_Say_10_Should_Be_Display_Buzz() {
        String result = fizzBuzz.Say(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void When_Say_15_Should_Be_Display_FizBuzz() {
        String result = fizzBuzz.Say(15);
        assertEquals("FizzBuzz", result);
    }

}
