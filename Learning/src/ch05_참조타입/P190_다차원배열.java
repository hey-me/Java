package ch05_참조타입;

public class P190_다차원배열 {

	public static void main(String[] args) {

		int[] ar = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 2;
		}
		System.out.println(ar); // 주소 출력
//	*2차원배열 ---- 기본적으로 이중for문을 써주어야 됨.
		int[][] br = new int[5][4]; // 행:5, 열:4
		// ar위치로 가면 값이 들어있지만 br위치로 가면 주소가 들어있음. (다차원 배열이기 때문.)
		System.out.println(br);
		System.out.println(br[0]); // 이것도 주소.
		System.out.println(br[1]); // 이것도 주소.

//		ar.length (O) 행의 개수
//		ar[0].length (X) 열 없음
//		br.length (O) 행의 개수
//		br[0].length (O) 열의 개수
//		br[0][0].length (X) 없음

		int[][][] cr = new int[1][2][3];

		int[][] dr = new int[2][];
		dr[0] = new int[2];
		dr[1] = new int[4];

		int[][] er = new int[3][4];
		int num = 1;
		for (int i = 0; i < er.length; i++) {
			for (int j = 0; j < er[i].length; j++) {
				er[i][j] = num++;
				System.out.print(er[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
//5개씩
		int[][] fr = new int[5][5];
		int num1 = 1;
		for (int i = 0; i < fr.length; i++) {
			for (int j = i; j < fr[i].length; j++) {
				fr[i][j] = num1++;
				System.out.printf("%3d", fr[i][j]);
			}
			System.out.println();
		}

//5개씩하는데 왼쪽아래부분 빈칸. 0으로 출력
		System.out.println("왼쪽 아래 빈칸");
		int[][] gr = new int[5][5];
		int num2 = 1;
		for (int i = 0; i < gr.length; i++) {
			for (int j = i; j < gr[i].length; j++) {
				gr[i][j] = num2++;
			}
		}
		for (int i = 0; i < gr.length; i++) {
			for (int j = 0; j < gr.length; j++) {
				System.out.printf("%3d", gr[i][j]);
			}
			System.out.println();
		}

//5개씩하는데 오른쪽아래부분 빈칸. 0으로 출력
		System.out.println("오른쪽 아래 빈칸");
		int[][] hr = new int[5][5];
		int num3 = 1;
		for (int i = 0; i < hr.length; i++) {
			for (int j = 0; j < hr[i].length - i; j++) {
				hr[i][j] = num3++;
			}
		}
		for (int i = 0; i < hr.length; i++) {
			for (int j = 0; j < hr.length; j++) {
				System.out.printf("%3d", hr[i][j]);
			}
			System.out.println();
		}

//5개씩하는데 왼쪽윗부분 빈칸. 0으로 출력
		System.out.println("왼쪽 위 빈칸");
		int[][] ir = new int[5][5];
		int num4 = 1;
		for (int i = 0; i < ir.length; i++) {
			for (int j = ir.length - i - 1; j < ir[i].length; j++) {
				ir[i][j] = num4++;

			}
		}
		for (int i = 0; i < ir.length; i++) {
			for (int j = 0; j < ir.length; j++) {
				System.out.printf("%3d", ir[i][j]);
			}
			System.out.println();
		}

//5개씩하는데 오른쪽윗부분 빈칸. 0으로 출력
		System.out.println("오른쪽 위 빈칸");
		int[][] jr = new int[5][5];
		int num5 = 1;
		for (int i = 0; i < jr.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				jr[i][j] = num5++;
			}
		}
		for (int i = 0; i < jr.length; i++) {
			for (int j = 0; j < jr.length; j++) {
				System.out.printf("%3d", jr[i][j]);
			}
			System.out.println();
		}

	}
}
