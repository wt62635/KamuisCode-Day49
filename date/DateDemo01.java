package date;

import java.util.Date;

/**
 * java.util.Date
 * Date的每一个实例用于表示一个具体的时间点，内部维护一个long值，
 * 表示的是自1970年1月1日00:00:00
 * 到当前Date表示的时间之间所经过的毫秒。
 * 
 * 由于Date存在时区等问题，导致大部分操作时间的方法都被声明为过时的，开发时不再建议使用。
 * 因此我们现在仅使用Date表示一个时间。
 * @author Administrator
 *
 */
public class DateDemo01 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		//大部分方法都被声明为过时的
		date.getYear();//例如调用此方法时，方法名上会出现删除线。
		
		/*
		 * 获取Date内部维护的long值使当前Date表示这个时间
		 */
		date.setTime(0);
		System.out.println(date);
	}
}
