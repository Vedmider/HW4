package study.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositiveToNegativeNumberTest {

    @Test
    public void shouldReturnNotNumberMessageWithTextInput(){
        String expected = "Not number";
        String actual = PositiveToNegativeNumber.convertFromPositiveToNegativeNumber("Simple not number text");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNotPositiveNumberMessageNonPositiveNumberInput(){
        String expected = "Not positive number";
        String actual = PositiveToNegativeNumber.convertFromPositiveToNegativeNumber("-5");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnConvertedPositiveToNegativeNumber(){
        String expected = "-54";
        String actual = PositiveToNegativeNumber.convertFromPositiveToNegativeNumber("54");

        assertEquals(expected, actual);
    }



}
