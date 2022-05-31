package test1018;

import java.util.StringTokenizer;

public class Ex10 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		int cnt=fullPath.lastIndexOf("\\");
		path=fullPath.substring(0,cnt);
		fileName=fullPath.substring(cnt+1);
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
		
//		실행결과
//		fullPath:c:\jdk1.8\work\PathSeparateTest.java
//		path:c:\jdk1.8\work
//		fileName:PathSeparateTest.java
				
	}

}
