package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期
 * 程序启动后要求输入一个商品的生产日期：yyyy-MM-dd
 * 然后再输入一个数字表示保质期的天数。
 * 经过程序计算，输出该商品的促销日，格式同上。
 * 
 * 计算规则：商品过期日前两周的周三
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		System.out.println("输入商品的生产日期：(例：2008-01-01)");
		Scanner sc = new Scanner(System.in);
		String made = sc.nextLine();
		System.out.println("输入保质期天数：（例：30）");
		int limit = sc.nextInt();
		
		int year = Integer.parseInt(made.substring(0,4));
		int month = Integer.parseInt(made.substring(5,7));
		int day = Integer.parseInt(made.substring(8));

		calendar.set(year, month-1, day);
		
		//计算促销日
		calendar.add(Calendar.DAY_OF_YEAR, limit-14);
		calendar.set(Calendar.DAY_OF_WEEK, 4);
		
		Date date = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sellDay = sdf.format(date);
		System.out.println("促销日为："+ sellDay);
	}
}
