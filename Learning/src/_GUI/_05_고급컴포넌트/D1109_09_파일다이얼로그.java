package _GUI._05_���������Ʈ;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class D1109_09_���ϴ��̾�α� {
/*  *JFileChooser
		-���� �ý����� Ž����� ���� ����� �ϴ� ���̾�α�
		-����ڿ��� �����̳� ���͸��� ���� �����ϵ��� �ϴ� ���
		-���̾�α� ����
			1)���� ���� ���̾�α�(File Open Dialog)
			2)���� ���� ���̾�α�(File Save Dialog)
	*���� ����
		1)���� ���̾�α׿��� ����ڰ� ������ �����ϴ� ������?
			-����ڰ� ������ ���� �̸��� ��� ����
			-������ �аų� ���� ������ �ƴ�
		2)���̾�α� �ݱ��?
			-���̾�αװ� ȭ�鿡�� ������ �ʰ� ��
			-JFileChooser ��ü�� �������ų� ����� �� ���� ���� �ƴ�
				showOpenDialog() �޼ҵ带 ȣ���ϸ� �ٽ� ȭ�鿡 ����ϰ� ���� ����
			-���̾�αװ� ���� �� JFileChooser ��ü�κ��� ����ڰ� �Է��� ������ �˾Ƴ� �� ����

	**���� ���� ���̾�α� ���� ����
 */
	public static void main(String[] args) {
//		1.JFileChooser ��ü ����
		JFileChooser chooser = new JFileChooser();
		
//		2. ���� ����   ��ü ����
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"JPG & GIF", "jpg", "gif");
		
//		3. JFileChooser�� ���� ���� ����
		chooser.setFileFilter(filter);
		
//		4. ���� ���̾�α� ���
		int ret = chooser.showOpenDialog(null);

//		5. ����ڰ� ������ ���� �̸� �˾Ƴ���
		if(ret == JFileChooser.APPROVE_OPTION) {
			String pathName = chooser.getSelectedFile().getPath();
			String fileName = chooser.getSelectedFile().getName();
		}
//		���� ���� ���̾�α� ���� ����
//		int ret = chooser.showSaveDialog(null);



	}

}
