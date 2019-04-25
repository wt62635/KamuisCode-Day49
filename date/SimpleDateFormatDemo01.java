package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以按照指定的日期格式在Date与String之间相互转换。
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		/*
		 * 时间表示格式：
		 * 2019年4月25日10:23:37 上午 星期四
		 * yyyy-MM-dd HH:mm:ss a E
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss a E");
		/*
		 * String format(Date date)
		 * 将给定的Date对象按照SDF指定的日期格式转换为字符串
		 */
		String str = sdf.format(date);
		System.out.println(str);
	}
}
