package Java字符串;

import java.util.Locale;

/*
 * 以下实例演示了通过format()方法来格式化字符串，还可以指定区域来格式化
 */
public class 字符串格式化 {
	public static void main(String[] args) {
		double e = Math.E;
		System.out.format("%f%n", e);
		System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);// 指定本地为德国（GERMENY)
	}
}
