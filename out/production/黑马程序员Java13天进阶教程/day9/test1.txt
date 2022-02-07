package day9._03Stream流;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("张大家");
        list.add("唐五");
        list.add("张少年");
        list.add("张少年");
        
        //利用Stream流筛选出姓张且姓名长度为3的人
        //001
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("------------------");
        
        //002
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("------------------");
        
        //姓张且姓名长度为3的人数
        long count = list.stream().filter(s -> s.startsWith("张") && s.length() == 3).count();
        System.out.println(count);
        System.out.println("------------------");
        
        //取集合中的前两人
        list.stream().limit(2).forEach(System.out::println);
        System.out.println("------------------");
        
        //取除去集合中的前两人的其他人
        list.stream().skip(2).forEach(System.out::println);
        System.out.println("------------------");
        
        //在所有人的名字前加上“可爱的”修饰
        //001
        list.stream().map(new Function<String, Object> /* 或<String, String> */ () {
            @Override
            public Object /*或String*/ apply(String s) {
                return "可爱的" + s;
            }
        }).forEach(System.out::println);
        System.out.println("------------------");
        
        //002(加“123”修饰)
        list.stream().map(s -> 123 + s).forEach(System.out::println);
        System.out.println("------------------");
        
        //将所有人转化为学生类
        list.stream().map(Student::new).forEach(System.out::println);
        System.out.println("------------------");
        
        //数组流
        Stream<Integer> s1 = Stream.of(10, 20, 30, 40, 50);
        //集合流
        Stream<String> s2 = list.stream();
        //合并流
        Stream<Object> allStream = Stream.concat(s1, s2);
        // Stream<? extends Serializable> allStream = Stream.concat(s1, s2); (序列流)
        allStream.forEach(System.out::println);
        System.out.println("------------------");
        
        //收集Stream流（将Stream流转化成集合或数组）
        //Stream只能使用一次!!
        Stream<String> listStream1 = list.stream();
        Stream<String> listStream2 = list.stream();
        Stream<String> listStream3 = list.stream();
        Stream<String> listStream4 = list.stream();
        Stream<String> listStream5 = list.stream();
        //将Stream流转化为Set集合
        Set<String> sets = listStream1.collect(Collectors.toSet());
        System.out.println(sets);
        //将Stream流转化为List集合
        List<String> lists1 = listStream2.collect(Collectors.toList());
        List<String> lists2 = listStream3.toList();
        System.out.println(lists1);
        System.out.println(lists2);
        //将Stream流转化为数组
        Object[] arr1 = listStream4.toArray();
        String[] arr2 = listStream5.toArray(String[]::new);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}

class Student {
    private String name;
    
    public Student() {
    
    }
    
    public Student(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
