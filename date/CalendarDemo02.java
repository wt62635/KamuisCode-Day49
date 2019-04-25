package date;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar提供了获取指定时间分量对应值的方法：
 * int get(int field)
 * 
 * Calendar定义了大量的常量表示不同的时间分量
 * @author Administrator
 *
 */
public class CalendarDemo02 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		//获取年
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		//获取月 ※月是从0开始计算的，所以取值要+1
		int month = calendar.get(Calendar.MONTH)+1;
		System.out.println(month);
		//获取日
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		//2019-4-25
		/*
		 * 获取日
		 * 与"天"相关的时间分量
		 * DAY_OF_MONTH	:月中天
		 * DAY_OF_WEEK	:周中天
		 * DAY_OF_YEAR	:年中天
		 * DATE			:月中天
		 */
		//※星期日为一周中的第一天，所以在取值时需要-1。
		int day1 = calendar.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("星期" + (day1));
		int day2 = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("月中第" + day2 + "周");
		int day3 = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println("年中第" + day3 + "天");
		
		int h = calendar.get(Calendar.HOUR_OF_DAY);//日中时
		int m = calendar.get(Calendar.MINUTE);//分
		int s = calendar.get(Calendar.SECOND);//秒
		System.out.println(h + ":" + m + ":" + s);
		
		//汉字显示
		String weekDay[] = {"日","一","二","三","四","五","六"};
		System.out.println("今天是星期" + weekDay[day1]);
		
		//获取指定时间分量所允许的最大值
		int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年共有" + days + "天");
		days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("当月共有" + days + "天");
	}
}
