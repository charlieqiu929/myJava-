package Java�ַ���;
/*
 * ����ʵ����ͨ���ַ������� substring() ������ɾ���ַ����е�һ���ַ���
 * �����ܷ�װ�� removeCharAt ������
 */
public class ɾ���ַ����е�һ���ַ� {

	public static void main(String[] args) {
		String str = "this is Java";
		System.out.println(removeCharAt(str,3));	
	}
	public static String removeCharAt(String s, int pos) {
		return s.substring(0, pos) + s.substring(pos +1);
		
		
	}

}
