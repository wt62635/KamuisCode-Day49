package date;

import java.util.Calendar;

/**
 * void add(int field, int amount)
 * 对指定时间分量加上给定的值，若给定的值为负数则是减去
 * @author Administrator
 *
 */
public class CalendarDemo04 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		/*
		 * 3年2个月零25天以后是哪天？
		 */
		//加3年
		calendar.add(Calendar.YEAR, 3);
		System.out.println(calendar.getTime());
		//加两个月
		calendar.add(Calendar.MONTH, 2);
		System.out.println(calendar.getTime());
		//加25天
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
	}
}
