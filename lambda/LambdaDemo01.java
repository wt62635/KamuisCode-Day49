package lambda;
/**
 * lambda表达式 JDK8推出后推出的一个新特性
 * lambda旨在让我们可以以“函数式编程”
 * 
 * lambda可以用更简便的语法创建匿名内部类
 * 语法：
 * （参数列表）->{
 * 方法体
 * }
 * 
 * 需要注意，lambda创建的匿名内部类所述的接口
 * 必须只能有一个抽象方法，否则编译不通过。
 * @author Administrator
 *
 */
public class LambdaDemo01 {
	public static void main(String[] args) {
		//常规写法
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("hello");
			}
		};
		//lambda表达式写法
		Runnable r2 = ()->{
			System.out.println("hello");
		};
		/*
		 * 如果方法只有一句代码，那么lambda的{}也可以省略
		 */
		Runnable r3 = ()->System.out.println("hello");
	}
}
