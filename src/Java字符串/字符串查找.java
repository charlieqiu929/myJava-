package Java�ַ���;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * ����ʵ��ʹ���� String ���е�indexOf() �������ַ����в������ַ������ֵ�λ�ã�
 * ������ڷ����ַ������ֵ�λ�ã���һλΪ0������������ڷ���-1
 */
public class �ַ������� {
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
