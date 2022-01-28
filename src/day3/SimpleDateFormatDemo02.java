package day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatDemo02 {
    /**
     * 传入的date格式示例:“2022-01-23 21:59:00”, 为传入的时间增加243天15时26分05秒后输出，格式与传入格式相同。
     */
    public String change(String date) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse(date);
        long time = date1.getTime() + 21050765000L;
        return sdf.format(new Date(time));
    }
}
