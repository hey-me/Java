package ch14_입출력스트림;
import java.io.*;
public class D1027_2_보조스트림 {
	public static void main(String[] args) throws Exception {
/*		
	*보조스트림
		데이터를 변환해서 입출력하거나, 출력형식을 지정하고 싶을때
		사용하려면 주 스트림과 연결해야됨.
			
		보조스트림 변수 = new 보조스트림(연결스트림);
		=> ()안에 주 스트림을 적어주면 됨.
		아래 예시 확인	
 */
		InputStream is = new FileInputStream("C:/Temp/tt"); //주스트림
		InputStreamReader readerrr = new InputStreamReader(is); //보조스트림
		
		BufferedReader br = new BufferedReader(readerrr); //성능향상 보조스트림  
		//buffer클래스가 다른 리더클래스의 상속을 받고 있으므로 부모 클래스의 메소드 사용 가능	
/*	  
  
 	*OutputStreamWriter   => 문자스트림
		바이트스트림을 문자스트림으로 바꿔줌
		아래 예시							*/
		OutputStream fos = new FileOutputStream("C:/Temp/fos");
		Writer writer = new OutputStreamWriter(fos);

/*	  
  
	*OutputStreamWriter   => 문자스트림
		바이트스트림을 문자스트림으로 바꿔줌
		아래 예시							*/
		InputStream fis = new FileInputStream("C:/Temp/fis");
		Reader reader = new InputStreamReader(fis);
	}

}
