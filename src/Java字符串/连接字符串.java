package Java字符串;

/*
 * 以下实例通过"+"操作符和StringBuffer.append()方法来连接字符串，并比较其性能
 */
public class 连接字符串 {
	public static void main(String[] args) {
		long stratTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			String result = "This is " + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("字符串连接" + " - 使用 + 操作符 ：" + (endTime - stratTime) + "ms");

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			StringBuffer result = new StringBuffer();
			result.append("This is");
			result.append("testing the");
			result.append("difference");
			result.append("between");
			result.append("String");
			result.append("and");
			result.append("StringBuffer");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("字符串连接" + " - 使用StringBuffer ：" + (endTime1 - startTime1) + "ms");
	}
}
