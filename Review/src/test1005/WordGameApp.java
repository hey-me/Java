package test1005;

import java.util.Scanner;

public class WordGameApp {
	Player [] players;
	Scanner s=new Scanner(System.in);
	public void run() {
		System.out.println("�����ձ� ������ �����մϴ�...");
		createPlayers(); // �����ڸ� ���� Player []�� �����Ѵ�.
		
		
		String startWord="�ƹ���";
		String lastWord = startWord; 
		System.out.println("�����ϴ� �ܾ�� "+lastWord+ "�Դϴ�");
		int next = 0; // �����ڵ��� ������� ����
		
		while (true) {
			String newWord = players[next].getWordFromUser(); // next �����ڰ� �ܾ ���ϵ��� �Ѵ�.
			
			if (!players[next].checkSuccess(lastWord)) { // next �����ڰ� �����Ͽ����� �˻�.
				System.out.print(players[next].getName() + "�� �����ϴ�.");
				break; // ������ �����Ѵ�.
			}
			next++; // ���� ������
			next %= players.length; // next�� �������� �������� ���� �����ϴ� ���� ���´�.
			lastWord = newWord;
		}
	}

	public void createPlayers() {
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int n=s.nextInt();
		players=new Player[n];
		for (int i = 0; i < players.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String str=s.next();
			players[i]=new Player(str);
		}
	}

	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();
	}

}

class Player {
	private Scanner scanner; // Ű���� �Է�
	private String name; // ���� �������� �̸�
	private String word; // �����ڰ� ���� �ܾ�

	Player(){
		
	}
public Player(String name) {
	this.name = name;
	scanner= new Scanner(System.in);
}

public String getWordFromUser() {
	System.out.print(this.name+">>");
	this.word=scanner.next();
	return word;
}
String getName() {
	return this.name;
}
boolean checkSuccess(String word) {
	if(word.charAt(word.length()-1)==this.word.charAt(0)) {
	return true;
	} else {
		return false;
	}
}
}