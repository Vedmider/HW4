package study.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ByteToIntTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWithNonNumericArguments() {

        ByteToInt.convertBinaryToInt("NotBinaryString");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWithNonBitNumericArguments() {

        ByteToInt.convertBinaryToInt("235423");
    }

    @Test
    public void shouldNotThrowIllegalArgumentExceptionWithValidArguments() {

        int expected = 2;
        int actual = ByteToInt.convertBinaryToInt("10");

        assertEquals(expected, actual);
    }


}
