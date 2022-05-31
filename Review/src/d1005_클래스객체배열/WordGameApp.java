package d1005_Ŭ������ü�迭;

import java.util.Scanner;

public class WordGameApp {
	Scanner s = new Scanner(System.in);
	Player[] players = new Player[0]; 
	
	public WordGameApp() {}
	public void run() {
		System.out.println("�����ձ� ������ �����մϴ�...");
		createPlayers(); // �����ڸ� ���� Player []�� �����Ѵ�. 
		
		String startWord = "�ƹ���";
		String lastWord = startWord; 
						
		int next = 0; // �����ڵ��� ������� ����
		// ������ ���� ������ ����
		for (int i = 0; i < players.length; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = s.next();
			players[i] = new Player(name);
		}
		System.out.println("�����ϴ� �ܾ�� "+lastWord+ "�Դϴ�");
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
		int n = s.nextInt();
		players = new Player[n]; 
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

	public Player(String name) {
		this.name = name;
		scanner= new Scanner(System.in);
	}
	public String getWordFromUser() {
		System.out.print(name + ">>");
		word = scanner.next();
		return word;
	}
	public String getName () {
		return name;
	}
	public boolean checkSuccess(String lastWord) {
		if(word.charAt(0)==lastWord.charAt(lastWord.length()-1)) {
			return true;
		}
		return false;
	}

	

}