package ch14_����½�Ʈ��;
import java.io.*;
public class D1027_2_������Ʈ�� {
	public static void main(String[] args) throws Exception {
/*		
	*������Ʈ��
		�����͸� ��ȯ�ؼ� ������ϰų�, ��������� �����ϰ� ������
		����Ϸ��� �� ��Ʈ���� �����ؾߵ�.
			
		������Ʈ�� ���� = new ������Ʈ��(���ὺƮ��);
		=> ()�ȿ� �� ��Ʈ���� �����ָ� ��.
		�Ʒ� ���� Ȯ��	
 */
		InputStream is = new FileInputStream("C:/Temp/tt"); //�ֽ�Ʈ��
		InputStreamReader readerrr = new InputStreamReader(is); //������Ʈ��
		
		BufferedReader br = new BufferedReader(readerrr); //������� ������Ʈ��  
		//bufferŬ������ �ٸ� ����Ŭ������ ����� �ް� �����Ƿ� �θ� Ŭ������ �޼ҵ� ��� ����	
/*	  
  
 	*OutputStreamWriter   => ���ڽ�Ʈ��
		����Ʈ��Ʈ���� ���ڽ�Ʈ������ �ٲ���
		�Ʒ� ����							*/
		OutputStream fos = new FileOutputStream("C:/Temp/fos");
		Writer writer = new OutputStreamWriter(fos);

/*	  
  
	*OutputStreamWriter   => ���ڽ�Ʈ��
		����Ʈ��Ʈ���� ���ڽ�Ʈ������ �ٲ���
		�Ʒ� ����							*/
		InputStream fis = new FileInputStream("C:/Temp/fis");
		Reader reader = new InputStreamReader(fis);
	}

}
