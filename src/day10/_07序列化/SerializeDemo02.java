package day10._07序列化;

import java.io.*;

public class SerializeDemo02 {
    public static void main(String[] args) throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/day10/obj.dat"))) {
            User user = (User) ois.readObject();
            System.out.println(user);
            System.out.println("序列化对象成功~~~~~");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
