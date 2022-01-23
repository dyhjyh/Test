package day1._02;

import java.util.ArrayList;

public class Test2 {
}

class Fancy {
    ArrayList<Integer> list = new ArrayList<>();
    
    public Fancy() {
    }
    
    public void append(int val) {
        list.add(val);
    }
    
    public void addAll(int inc) {
        for (int i = 0; i < list.size(); i++) {
            int temp = (list.get(i) + inc) % (int)(10e9 + 7);
            list.set(i, temp);
        }
    }
    
    public void multAll(int m) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i) * m % (int)(10e9 + 7);
            list.set(i, temp);
        }
    }
    
    public int getIndex(int idx) {
        try {
            return (list.get(idx) % (int)(10e9 + 7));
        } catch (IndexOutOfBoundsException e) {
            return -1;
        }
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */
