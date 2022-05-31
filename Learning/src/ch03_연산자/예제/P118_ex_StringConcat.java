package ch03_¿¬»êÀÚ.¿¹Á¦;

public class P118_ex_StringConcat {

	public static void main(String[] args) {

		String str1 = "JDK" + 6.0; //JDK6.0
		String str2 = str1 + "Æ¯Â¡"; //JDK6.0Æ¯Â¡ 
		System.out.println(str2);

		String str3 = "JDK" + 3 + 3.0; //JDK33.0
		String str4 = 3 + 3.0 + "JDK"; //6.0JDK
		System.out.println(str3);
		System.out.println(str4);
	}

}
