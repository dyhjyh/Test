package testDemo;

import java.util.Arrays;

public class F {
    public static void main(String[] args) throws NullPointerException {
        
//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        String s3 = null;
//
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//        System.out.println(Objects.equals(s3, s1));
//        System.out.println(s3.equals(s1));
        
//        String s3 = "abc";
//        String s4 = "abc";
//        System.out.println(System.identityHashCode(s3));
//        System.out.println(System.identityHashCode(s4));
        
        int[][] srcArr = {{1, 2}, {3}};
        int[][] destArr = new int[srcArr.length][];
        for (int i = 0; i < srcArr.length; i++) {
//            destArr[i] = new int[srcArr[i].length];
//            System.arraycopy(srcArr[i], 0, destArr[i], 0, srcArr[i].length);
            destArr[i] = srcArr[i].clone();
        }
        srcArr[0][0] = 0;
        
        for (int[] ints : destArr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
