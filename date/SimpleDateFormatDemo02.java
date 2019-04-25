package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 讲一个字符串解析为Date对象
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo02 {
	public static void main(String[] args) throws ParseException {
		String str = "2008-08-08 20:08:08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * Date parse(String str)
		 * 将给定的字符串按照SDF指定的日期格式解析为Date对象。
		 * 若给定的字符串与SDF指定的日期格式不匹配时
		 * 会抛出解析异常。
		 */
		Date date = sdf.parse(str);
		System.out.println(date);
	}
}
