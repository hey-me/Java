package ch05_참조타입;
public class D0823_1_참조타입과참조변수 {
	public static void main(String[] args) {
//	**	메모리
//		- ROM : 읽기전용
//		- RAM : 주기억장치(휘발성-화면에 나타나고 없어짐)
//		=> 보조 기억장치 (C:) (비휘발성)        ===== 보조기억장치에서 주기억장치로 Loading.
//		+ JVM(Java Virtual Machine) 클래스파일을 실행해줌.
//		+ 메모리를 각 구역에 저장. 
//		+ int a = 10 =>a라는 주소에 10이라는 값을 저장. (int이므로 4byte를 차지)
//		===>>>> 참조타입은 값 말고 주소를 저장함. (a를 저장)
		int a = 10; // 정수형 변수에 10이라는 값을 저장 //기본형변수
		String name = "홍길동"; // 참조타입변수에 name이라는 주소를 저장 //참조변수 (참조변수는 4byte)

//	**	참조변수의 ==, != 연산
//		주소를 비교하는 것. (값x)
//		String 은 예외..
		String name1 = "홍";
		String name2 = "홍";
		System.out.println(name1 == name2);
//		원래 주소를 비교하므로 False가 나와야 맞지만 String은 같은 문자열을 두 번 저장하지 않고 그대로 복사함. 따라서 True가 나옴.
		String name3 = new String("홍");
		String name4 = new String("홍");
		System.out.println(name3 == name4);
//		False ... new로 했기때문에 같은 내용이라 할지라도 새로 만듦.
//		같은 내용을 출력할지라도 주소는 다름. 따라서 False.

//		null 은 아무것도 가지지 않음을 뜻함.   		Scanner s = null; int a = s.nextInt();
//		name2 = null; 					=>	s에 아무것도 없으므로 실행 불가.. 오류

		System.out.println(name3 == name4); // 주소. new에 저장되어 둘의 주소가 다르므로 False
		System.out.println(name3.equals(name4)); // 값. .. new에 저장 되어있더라도 값이 같으므로 True
	}

}
