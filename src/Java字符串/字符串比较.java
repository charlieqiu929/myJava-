package Java�ַ���;
/*
 * ����ʵ����ͨ���ַ������� 
 * compareTo(string),compareTolgnoreCase(String)�� compareTo(object string)
 * ���Ƚ������ַ������������ַ����е�һ����ĸASCII�Ĳ�ֵ
 */
public class �ַ����Ƚ� {

	public static void main(String[] args) {
		String str = "Hello World";
		String anotherString = "hello world";
		Object objStr = str;
		
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));//���Դ�Сд
		System.out.println(str.compareTo(objStr.toString()));

	}

}
