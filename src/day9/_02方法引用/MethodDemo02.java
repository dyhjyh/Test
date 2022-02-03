package day9._02方法引用;

import java.util.Arrays;
import java.util.Comparator;

//特定类型（sun公司提供的特定类型，例如String，SimpleDateFormat，Date，Exchanger等）方法引用
//特定类型::方法
public class MethodDemo02 {
    public static void main(String[] args) {
        String[] array = {"afg", "rrn", "Dfg", "Afe", "dgg"};
    
        //给array中的元素按照首字母排序（不分大小写）
        //001
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        
        //002
        Arrays.sort(array, (o1, o2) -> o1.compareToIgnoreCase(o2));
        
        //003
        Arrays.sort(array, String::compareToIgnoreCase);
        
        System.out.println(Arrays.toString(array));
    }
}
