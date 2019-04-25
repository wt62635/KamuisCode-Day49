package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 有参方法
 * @author Administrator
 *
 */
public class lambdaDemo02 {
	public static void main(String[] args) {
		List<String> list  = new ArrayList<>();
		list.add("Kamui");
		list.add("Subaru");
		list.add("Luna");
		
		Collections.sort(list);
//		Comparator<String> c = new Comparator<String>() {
//			public int compare(String o1,String o2) {
//				return o1.length()-o2.length();
//			}
//		};
		//第一种写法
//		Comparator<String> c = (o1,o2)->{
//			return o1.length()-o2.length();
//		};
		//第二种写法
		Comparator<String> c = (o1,o2)->
			o1.length()-o2.length();
		
		Collections.sort(list, c);
		System.out.println(list);
	}
}
