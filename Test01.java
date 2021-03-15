package homework_day03;

import java.util.Calendar;
import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,3);
        Date time = cal.getTime();
        System.out.println(time);
    }
}
