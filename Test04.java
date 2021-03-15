package homework_day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入该产品的生产日期(格式为xxxx-xx-xx):");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        if(date.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")){
            Date proDate = d.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(proDate);
            System.out.println("请输入保质期天数:");
            int days = sc.nextInt();
            if(days >= 14) {
                cal.add(Calendar.DATE, days);
                cal.add(Calendar.DATE, -14);
                cal.set(Calendar.DAY_OF_WEEK, 4);
                Date day = cal.getTime();
                String str = d.format(day);
                System.out.println("促销日是" + str);
            }else{
                System.out.println("逻辑上不符合促销在生产日期前!保质期应该大于14天,不然无法销售该产品");
            }
        }else{
            System.out.println("输入格式有误!");
        }
    }
}
