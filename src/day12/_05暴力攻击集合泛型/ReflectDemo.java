package day12._05暴力攻击集合泛型;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        // 泛型只能工作在编译阶段，运行阶段泛型就消失了
        // 反射工作在运行时阶段
        List<Double> scores = new ArrayList<>();
        scores.add(99.3);
        scores.add(199.3);
        scores.add(89.5);
        
        // 通过反射暴力地注入一个其他类型的数据进去
        Class<?> c = scores.getClass(); //获取的ArrayList的class对象
        Method add = c.getDeclaredMethod("add", Object.class);
        add.invoke(scores, "aaa");
    
        System.out.println(scores);
    }
}
