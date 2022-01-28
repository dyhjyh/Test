import day3.SimpleDateFormatDemo02;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SimpleDateFormatDemo02Test {
    @Test
    public void testChange() throws ParseException {
        SimpleDateFormatDemo02 sdf = new SimpleDateFormatDemo02();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int year = random.nextInt(8000) + 1999;
            int mouth = random.nextInt(12) + 1;
            int day = random.nextInt(28) + 1;
            int hour = random.nextInt(24) + 1;
            int minute = random.nextInt(60) + 1;
            int second = random.nextInt(60) + 1;
            String in = String.format("%04d-%02d-%02d %02d:%02d:%02d", year, mouth, day, hour, minute, second);
            String out = sdf.change(in);
            Assert.assertEquals("结果错误", test(in), out);
        }
    }
    public String test(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse(date);
        long time = date1.getTime() + 21050765000L;
        return sdf.format(new Date(time));
    }
}
