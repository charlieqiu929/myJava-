package Java�ַ���;
/*
 * ����ʵ��ʹ���� regionMatches()������������֬���������Ƿ����
 */
public class ���������ַ��������Ƿ���� {
	public static void main(String[] args) {
		String first_str = "Welcome to Microsoft";
		String second_str = "I work with microsoft";
		boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
		/*
		 * first_str.regionMatches(11, second_str, 12, 9)��ʾ��first_str�ַ����ӵ�11���ַ���M����ʼ��second_str�ַ����ĵ�12���ַ���M����ʼ����Ƚϣ�
		 * ���Ƚ�9���ַ��������ַ������ִ�Сд�����Խ��Ϊfalse
		 * 
		 * ������õ�һ������Ϊtrue�����ʾ���Դ�Сд�������Է���trueB
		 */
		boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);
		//��һ������true ��ʾ���Դ�Сд����
		System.out.println("���ִ�Сд����ֵ�� " + match1);
		System.out.println("�����ִ�Сд����ֵ; " + match2);
	}
}
