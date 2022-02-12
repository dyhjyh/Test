package day12._06反射有啥用;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class Mybatis {
    // 提供一个方法，可以保存一切对象数据的字段和具体值
    public static void save(Object obj) throws Exception {
        try (PrintStream ps = new PrintStream(new FileOutputStream("src/day12/data.txt", true))) {
            Class<?> c = obj.getClass();
            ps.println("========" + c.getSimpleName() + "========");
            
            Field[] fields = c.getDeclaredFields();
            for (Field field : fields) {
                String name = field.getName();
                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name + "=" + value);
            }
        }
    }
}
