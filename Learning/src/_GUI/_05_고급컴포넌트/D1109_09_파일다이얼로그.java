package _GUI._05_고급컴포넌트;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class D1109_09_파일다이얼로그 {
/*  *JFileChooser
		-파일 시스템의 탐색기와 같은 기능을 하는 다이얼로그
		-사용자에게 파일이나 디렉터리를 쉽게 선택하도록 하는 기능
		-다이얼로그 종류
			1)파일 열기 다이얼로그(File Open Dialog)
			2)파일 저장 다이얼로그(File Save Dialog)
	*주의 사항
		1)파일 다이얼로그에서 사용자가 파일을 선택하는 행위란?
			-사용자가 선택한 파일 이름을 얻기 위함
			-파일을 읽거나 쓰는 행위가 아님
		2)다이얼로그 닫기란?
			-다이얼로그가 화면에서 보이지 않게 됨
			-JFileChooser 객체가 없어지거나 사용할 수 없게 것이 아님
				showOpenDialog() 메소드를 호출하면 다시 화면에 출력하고 재사용 가능
			-다이얼로그가 닫힌 후 JFileChooser 객체로부터 사용자가 입력한 정보를 알아낼 수 있음

	**파일 열기 다이얼로그 생성 과정
 */
	public static void main(String[] args) {
//		1.JFileChooser 객체 생성
		JFileChooser chooser = new JFileChooser();
		
//		2. 파일 필터   객체 생성
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"JPG & GIF", "jpg", "gif");
		
//		3. JFileChooser에 파일 필터 설정
		chooser.setFileFilter(filter);
		
//		4. 열기 다이얼로그 출력
		int ret = chooser.showOpenDialog(null);

//		5. 사용자가 선택한 파일 이름 알아내기
		if(ret == JFileChooser.APPROVE_OPTION) {
			String pathName = chooser.getSelectedFile().getPath();
			String fileName = chooser.getSelectedFile().getName();
		}
//		파일 저장 다이얼로그 생성 과정
//		int ret = chooser.showSaveDialog(null);



	}

}
