package lesson6;

import lesson4.Cat;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCat {

    @Test
    public void test1() {
        int ageToChange = 10;
        Cat cat = new Cat("Vasiliy");
        cat.setAge(ageToChange);
        int actualAge = cat.getAge();
        int expectedAge = ageToChange;
        assertEquals(actualAge, expectedAge);
    }
}
