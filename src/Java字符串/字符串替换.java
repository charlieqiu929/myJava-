package Java字符串;
/*
 * 以下实例中使用 java String 类中的 replace 方法来替换字符串中的字符
 */
public class 字符串替换 {
	public static void main(String[] args) {
		String str= "Hello World";
		System.out.println(str.replace('H', 'W'));
		System.out.println(str.replaceFirst("He", "Wa"));
		System.out.println(str.replaceAll("He", "Ha"));		
	}	
}
