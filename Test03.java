package homework_day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入生日日期,输入的格式为xxxx-xx-xx:");
        Scanner sc = new Scanner(System.in);
        String bd = sc.nextLine();

        if(bd.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")){
            Date birdate = d.parse(bd);
            Date recentTime = new Date();
            long timeDifference = recentTime.getTime() - birdate.getTime();
            long weekDifference = timeDifference/1000/60/60/24/7;
            System.out.println("到今天为止经过了"+weekDifference+"周");
        }else{
            System.out.println("输入格式有误!");
        }
    }
}
