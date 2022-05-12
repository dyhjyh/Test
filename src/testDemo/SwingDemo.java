package testDemo;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container container = frame.getContentPane();
        JButton button = new JButton("1");
        container.add(button);
    }
}
