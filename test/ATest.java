import org.junit.Assert;
import org.junit.Test;

import testDemo.A;

public class ATest {
    
    @Test
    public void testLogin() {
        A a = new A();
        String result = a.login("admin1", "123456");
        Assert.assertEquals("测试不通过!", "success", result);
    }
}
