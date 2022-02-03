package day9._02方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

//构造器的方法引用
//类名::new
public class MethodDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java1");
        list.add("Java2");
        list.add("Java3");
        
        //将List集合转换为对应类型的数组
        //001
        Object[] obj = list.toArray();
        String[] str1 = new String[obj.length];
        for (int i = 0; i < obj.length; i++) {
            str1[i] = (String) obj[i];
        }
        System.out.println(Arrays.toString(str1));
        
        //002
        String[] str2 = list.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) { //value为list的size
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(str2));
        
        //003
        String[] str3 = list.toArray(s -> new String[s]);
        System.out.println(Arrays.toString(str3));
        
        //004
        String[] str4 = list.toArray(String[]::new);
        System.out.println(Arrays.toString(str4));
        
    }
}
