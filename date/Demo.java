package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 编写一段程序：
 * 用户在控制台输入自己的生日，格式如：yyyy-MM-dd
 * 然后经过程序计算，输出到今天为止一共活了多少天。
 * 在输出其出生10000天的纪念日是哪天，格式同上。
 * @author Administrator
 *
 */
public class Demo {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Scanner sc = new Scanner(System.in);
		
		long now = date.getTime();//获取至今全部时间(ms)
		System.out.println("输入生日：（例：20190425）");
		date = sdf.parse(sc.nextLine());
		long birthday = date.getTime();//获取至生日全部时间(ms)
		long alive = (now-birthday)/1000/60/60/24;//存活日(day)
		
		System.out.println("至今存活："+alive+ "天");

		long theDay = 10000L*24L*60L*60L*1000L;//10000天时间(ms)
		long time = birthday+theDay;
		date = new Date(time);
		System.out.println("10000天纪念日：" + date);
	}
}
