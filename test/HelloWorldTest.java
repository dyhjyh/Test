import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testDemo.HelloWorld;

import java.io.*;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() throws InterruptedException {
        OutputStream os = new ByteArrayOutputStream();
        String s = "1";
        byte[] buffer = s.getBytes();
        System.setIn(new ByteArrayInputStream(buffer));
        System.setOut(new PrintStream(os));
        HelloWorld.main(null);
        Assertions.assertEquals("1\r\n", os.toString());
    }
}
