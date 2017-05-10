package Java字符串;
/*
 * 以下实例使用了String toUpperCase()方法将字符串从小写转为大写
 */
public class 字符串小写转大写 {
	public static void main(String[] args) {
		String str = "string abc toupperance";
		String strUpper = str.toUpperCase();
		System.out.println("Original String: " + str);
		System.out.println("String changed to upper case: " + strUpper);
	}
}
