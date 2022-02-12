package day11._01编程思维题目;

import java.io.*;

/**
 * 目标：复制文件夹/文件
 *
 * 源文件夹：D:\Users\DYH\Documents\Tencent Files
 * 目标文件夹：F:\test
 */
public class CopyDirDemo01 {
    public static void main(String[] args) {
        copyDir(new File("D:\\Users\\DYH\\Videos\\God of War"), new File("F:\\test"));
    }
    
    /**
     * 复制文件夹
     * @param srcDir 源文件夹/文件
     * @param destDir 目标文件夹
     */
    public static void copyDir(File srcDir, File destDir) {
        //1.判断是否存在原路径，是否是文件夹。
        if (srcDir.exists() && srcDir.isDirectory()) {
            //2.创建复制的目标文件夹。
            destDir.mkdirs();
            //3.提取源文件夹的一级文件对象。
            File[] files = srcDir.listFiles();
            //4.判断是否存在一级文件对象。
            if (files != null && files.length > 0) {
                //5.遍历一级文件对象。
                for (File file : files) {
                    //6.判断是否是文件。
                    if (file.isFile()) {
                        //直接复制过去到当前路径
                        copyFile(file, new File(destDir, file.getName()));
                    } else {
                        //file是文件夹了，作为新的原文件夹。
                        //目标文件夹：上一个文件夹destDir + 新文件夹名称
                        copyDir(file, new File(destDir, file.getName()));
                    }
                }
            }
        } else {
            File destFile = new File(destDir, srcDir.getName());
            copyFile(srcDir, destFile);
        }
    }
    
    public static void copyFile(File srcFile, File destFile) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
