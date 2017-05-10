package Java字符串;
/*
 * 以下演示了如何使用java的反转函数 reverse()将字符串反转
 */
public class 字符串反转 {
	public static void main(String[] args) {
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse: "+ string);
		System.out.println("String after reverse: "+ reverse);
	}
}
