package Java字符串;
/*
 * 以下实例使用了 regionMatches()方法测试两个脂肪层区域是否相等
 */
public class 测试两个字符串区域是否相等 {
	public static void main(String[] args) {
		String first_str = "Welcome to Microsoft";
		String second_str = "I work with microsoft";
		boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
		/*
		 * first_str.regionMatches(11, second_str, 12, 9)表示将first_str字符串从第11个字符”M“开始和second_str字符串的第12个字符”M“开始逐个比较，
		 * 共比较9对字符，由于字符串区分大小写，所以结果为false
		 * 
		 * 如果设置第一个参数为true，则表示忽略大小写区别，所以返回trueB
		 */
		boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);
		//第一个参数true 表示忽略大小写区别
		System.out.println("区分大小写返回值： " + match1);
		System.out.println("不区分大小写返回值; " + match2);
	}
}
