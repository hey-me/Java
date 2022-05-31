package test1018;

public class Ex11 {
	public static void main(String[] args) {
		printGraph(new int[] { 3, 7, 1, 4 }, '*');
		
	}
	
	static void printGraph(int[]dataArr, char c) {
		for (int i = 0; i < dataArr.length; i++) {
			for (int j = 0; j < dataArr[i]; j++) {
				System.out.print(c);
			}
			System.out.println(dataArr[i]);
		}
	}
}
