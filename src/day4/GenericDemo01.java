package day4;

import java.util.ArrayList;

public class GenericDemo01 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(123);
        list.add(4560);
        list.remove(123);
        System.out.println(list);
    }
}

class MyArrayList<E> {
    private ArrayList<E> list = new ArrayList<E>();
    
    public void add(E e) {
        list.add(e);
    }
    
    public void remove(E e) {
        list.remove(e);
    }
    
    public String toString() {
        return list.toString();
    }
}
