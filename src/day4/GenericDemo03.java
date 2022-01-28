package day4;

public class GenericDemo03 {
}

interface Date<E> {
    E getDate();
    void setDate(E e);
}

class Teacher implements Date<Teacher> {
    
    @Override
    public Teacher getDate() {
        return this;
    }
    
    @Override
    public void setDate(Teacher teacher) {
    
    }
}

class Student implements Date<Student> {
    
    @Override
    public Student getDate() {
        return null;
    }
    
    @Override
    public void setDate(Student student) {
    
    }
}