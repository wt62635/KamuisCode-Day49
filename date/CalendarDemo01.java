package date;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar 日历类
 * Calendar是一个抽象类，定义了操作时间的一系列方法。
 * 常用实现类GregorianCalendar,即：阳历
 * 
 * Calendar提供了静态方法getInstance,可以根据当前系统
 * 所在地区获取一个适用的实现类实例，大部分获取的都是阳历。
 * @author Administrator
 *
 */
public class CalendarDemo01 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/*
		 * 将当前Calendar表示的日期以Date实例形式返回。
		 */
		Date date = calendar.getTime();//返回Date对象
		/*
		 * void setTime(Date date)
		 * 调整Calendar表示给定的Date对象所表示的日期
		 */
		System.out.println(date);
	}
}
