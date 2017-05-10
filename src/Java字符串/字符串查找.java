package Java字符串;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * 以下实例使用了 String 类中的indexOf() 方法在字符串中查找子字符串出现的位置，
 * 如果存在返回字符串出现的位置（第一位为0），如果不存在返回-1
 */
public class 字符串查找 {
	public static void main(String[] args) {
		String strOrig = "Hello readers";
		int intIndex = strOrig.indexOf("Hello");
		if (intIndex == -1) {
			System.out.println("Hello not found");
		}else {
			System.out.println("Found Hello at index "+ intIndex);
		}
	}
}
