package ch07_���.����;

public class P311_ex_cellphoneŬ������� {

	public static void main(String[] args) {

		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : "+ dmbCellPhone.model);
		System.out.println("���� : "+ dmbCellPhone.color);
		
		//DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : "+ dmbCellPhone.channel);
		
		//CellPhone �ɷ����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������.");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}
//�θ� Ŭ����
class CellPhone {
	//�ʵ�
	String model;
	String color;
	//������
	//�޼ҵ�
	void powerOn() {System.out.println("������ �մϴ�.");}
	void powerOff() {System.out.println("������ ���ϴ�.");}
	void bell() {System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�ڱ� : "+ message);}
	void receiveVoice(String message) {System.out.println("���� : "+ message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
}

//�ڽ� Ŭ����
class DmbCellPhone extends CellPhone {
	//�ʵ�
	int channel;
	//������
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	//�޼ҵ�
	void turnOnDmb () {
		System.out.println("ä�� "+ channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� "+ channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}