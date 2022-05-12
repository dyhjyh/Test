package testDemo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class ConsoleDemo {
    public static void main(String[] args) throws InterruptedException, IOException {
        PrintStream old = System.out;
        OutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));
        System.out.println("test");
        System.setOut(old);
        System.out.println("556565");
        os.close();
        old.close();
    }
}
