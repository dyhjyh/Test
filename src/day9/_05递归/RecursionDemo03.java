package day9._05递归;

import java.io.File;
import java.io.IOException;

/**
 * 递归搜索文件
 */
public class RecursionDemo03 {
    private static long count = 0;
    public static void main(String[] args) throws IOException {
        searchFlies(new File("F:/"), "qq.exe");
        System.out.println("搜索出的文件个数为:" + count);
    }
    
    private static void searchFlies(File dir, String fileName) throws IOException {
        //01. 判断路径存在且是文件夹
        if (dir.exists() && dir.isDirectory()) {
            //02. 获取搜索文件夹下的所有文件对象
            File[] files = dir.listFiles();
            //03. 判断文件是否为null或为空
            if (files != null && files.length > 0) {
                //04. 遍历文件夹下的文件和文件夹
                for (File file : files) { //如果是文件
                    if (file.isFile() && file.getName().toLowerCase().contains(fileName.toLowerCase())) {
                        System.out.println(file.getAbsolutePath());
                        count++;
                          //找到后直接运行文件
//                        Runtime runtime = Runtime.getRuntime();
//                        runtime.exec(file.getAbsolutePath());
                    } else { //如果是文件夹
                        if (file.getName().toLowerCase().contains(fileName.toLowerCase())) {
                            System.out.println(file.getAbsolutePath());
                            count++;
                        }
                        searchFlies(file, fileName);
                    }
                }
            }
        }
    }
}
