package test.java.lesson6;

import main.java.HW.Task1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HWTest {

    @Test
    public void test1() {
        int arr[] = {4,5,-2,0,8};
        int actual = Task1.min(arr);
        int expected = -2;
        assertEquals(actual, expected);
    }
}
