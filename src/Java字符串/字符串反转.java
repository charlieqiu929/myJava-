package Java�ַ���;
/*
 * ������ʾ�����ʹ��java�ķ�ת���� reverse()���ַ�����ת
 */
public class �ַ�����ת {
	public static void main(String[] args) {
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse: "+ string);
		System.out.println("String after reverse: "+ reverse);
	}
}
