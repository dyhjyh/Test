package day10._04字符缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExecDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/day10/csb.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/day10/newCsb.txt"))) {
            
            List<String> data = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
    
            List<Character> sizes = new ArrayList<>();
            Collections.addAll(sizes, '零', '一', '二', '三', '四', '五', '六', '七', '八', '九');
            
            data.sort(Comparator.comparingInt(s -> sizes.indexOf(s.charAt(0))));
            // data.sort((s1, s2) -> sizes.indexOf(s1.charAt(0)) - sizes.indexOf(s2.charAt(0)));
            
            System.out.println(data);
    
            for (String datum : data) {
                bw.write(datum);
                bw.newLine();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
