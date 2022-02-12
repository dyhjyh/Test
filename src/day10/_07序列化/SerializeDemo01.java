package day10._07序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo01 {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/day10/obj.dat"))) {
            User user = new User("DYH", "450324");
            oos.writeObject(user);
            System.out.println("序列化对象成功~~~~~");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
