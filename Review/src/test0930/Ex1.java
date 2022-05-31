package test0930;

public class Ex1 {

	public static void main(String[] args) {
//		1��
//		ColorTV myTV=new ColorTV(32,1024);
//		myTV.printProperty();
//		
//		2��
		IPTV iptv=new IPTV("192.1.1.2",32,2048);
		
		iptv.printProperty();
	}

}
class TV{
	private int size;
	public TV(int size) {	this.size=size;	}
	protected int getSize() {	return size;	}
}

class ColorTV extends TV{
//	�Ʒ� �ƹ��͵� ���� �� �������� ����:Ŭ������ ����� �⺻������ ����Ʈ�����ڰ� �ִµ�
//	�����ھȿ��� super();�̰� �����Ǿ��ִµ� ����Ŭ�������� �Ű������� ���� ����Ʈ �����ڰ� ���
	int color;	//�ڱ�Ŭ������ �ʵ�� �ڱ�Ŭ���������ڿ��� �ʱ�ȭ���Ѿ���
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	public void printProperty(){
		System.out.println(getSize()+"��ġ "+ color+"�÷�");
//		super(size)�� �ȵǴ� ����:return�� ���� ������
	}
}

class IPTV extends TV{
	int color;
	String address;
	IPTV(int size){
		super(size);
	}
	IPTV( String address, int size, int color){
		super(size);
		this.color=color;
		this.address=address;
	}
	void printProperty() {
//		System.out.println("���� IPTV�� "+ address+" �ּ��� "+getSize()+" ��ġ "+color+" �÷�");
		System.out.print("���� IPTV�� "+ address+" �ּ��� ");
		ColorTV ctv=new ColorTV(getSize(),color);
		ctv.printProperty();
	}
}
