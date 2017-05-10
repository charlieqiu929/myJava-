package Java字符串;
/*
 * 以下实例中通过字符串函数
 * strOrig.lastIndexOf(Stringname)
 * 来查找子字符串Stringname 在StrOrig 出现的位置
 */
public class 查找字符串最后一次出现的位置 {

	public static void main(String[] args) {
		String strOrig = "Hello world ,Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");
		if(lastIndex == -1){
			System.out.println("Hello not found");
		}else {
			System.out.println("Last occurrence of Hello is at index "+lastIndex);
		}
	}

}
