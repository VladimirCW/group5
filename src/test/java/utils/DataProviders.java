package test.java.utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "dp1")
    public Object[][] dp1() {
        return new Object[][] {
                {"111"},
        };
    }

    @DataProvider(name = "dp2")
    public Object[][] dp2() {
        return new Object[][] {
                {"111"},
                {"222"},
                {"333"}
        };
    }
}
