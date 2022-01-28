package day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo02 {
    public static void main(String[] args) {
        String s = "电 teqrter话: jfafjio joi18178706612ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i 1jhj2110520@mail.sustech.edu.cn" +
                "邮re tre tre箱: re r er 1245687900@qq.com, Q wertrwe Q: rtret1245687900ret erter er tr er tert";
        
        //1. 定义爬取规则
        String regex = "([a-zA-Z0-9]+@\\w+(\\.\\w+){1,4})|(1[0-9]{10})|(\\d{8,10})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
