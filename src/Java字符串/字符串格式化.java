package Java�ַ���;

import java.util.Locale;

/*
 * ����ʵ����ʾ��ͨ��format()��������ʽ���ַ�����������ָ����������ʽ��
 */
public class �ַ�����ʽ�� {
	public static void main(String[] args) {
		double e = Math.E;
		System.out.format("%f%n", e);
		System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);// ָ������Ϊ�¹���GERMENY)
	}
}
