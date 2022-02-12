package day12._06反射有啥用;

public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(12110520, "DYH", 18, '男', "地球上", "8848");
        Mybatis.save(s1);
        
        Pig peiQi = new Pig("佩奇", 500.0, "粉色", "猪妈妈", "雌");
        Mybatis.save(peiQi);
    }
}
