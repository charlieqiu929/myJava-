package Java�ַ���;
/*
 * ����ʵ����ʹ�� java String ���е� replace �������滻�ַ����е��ַ�
 */
public class �ַ����滻 {
	public static void main(String[] args) {
		String str= "Hello World";
		System.out.println(str.replace('H', 'W'));
		System.out.println(str.replaceFirst("He", "Wa"));
		System.out.println(str.replaceAll("He", "Ha"));		
	}	
}
