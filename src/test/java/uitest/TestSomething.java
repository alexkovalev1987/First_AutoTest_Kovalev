package uitest;

import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import static org.testng.Assert.assertEquals;

public class TestSomething extends BaseTest {
    @Test (description = "123")
    void testSearch () {
        assertEquals ("NULL","AUTOTEST USER");
    }

    @Test (description = "123")
    void testsSearch () {
        assertEquals ("1","2");
    }
}
