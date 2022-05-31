package test1018;

public class Ex06 {

	public static void main(String[] args) {
		String a="korea&is&java&love&table&class";
		String str[]=a.split("&");
		for (int i = 0; i < str.length; i++) {
			System.out.println("분리된 문자열: "+(i+1)+"번째 "+str[i]);
		}
	}

}
