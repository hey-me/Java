package test1018;

public class Ex06 {

	public static void main(String[] args) {
		String a="korea&is&java&love&table&class";
		String str[]=a.split("&");
		for (int i = 0; i < str.length; i++) {
			System.out.println("�и��� ���ڿ�: "+(i+1)+"��° "+str[i]);
		}
	}

}
