package ch05_����Ÿ��;

public class P190_�������迭 {

	public static void main(String[] args) {

		int[] ar = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = i + 2;
		}
		System.out.println(ar); // �ּ� ���
//	*2�����迭 ---- �⺻������ ����for���� ���־�� ��.
		int[][] br = new int[5][4]; // ��:5, ��:4
		// ar��ġ�� ���� ���� ��������� br��ġ�� ���� �ּҰ� �������. (������ �迭�̱� ����.)
		System.out.println(br);
		System.out.println(br[0]); // �̰͵� �ּ�.
		System.out.println(br[1]); // �̰͵� �ּ�.

//		ar.length (O) ���� ����
//		ar[0].length (X) �� ����
//		br.length (O) ���� ����
//		br[0].length (O) ���� ����
//		br[0][0].length (X) ����

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
//5����
		int[][] fr = new int[5][5];
		int num1 = 1;
		for (int i = 0; i < fr.length; i++) {
			for (int j = i; j < fr[i].length; j++) {
				fr[i][j] = num1++;
				System.out.printf("%3d", fr[i][j]);
			}
			System.out.println();
		}

//5�����ϴµ� ���ʾƷ��κ� ��ĭ. 0���� ���
		System.out.println("���� �Ʒ� ��ĭ");
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

//5�����ϴµ� �����ʾƷ��κ� ��ĭ. 0���� ���
		System.out.println("������ �Ʒ� ��ĭ");
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

//5�����ϴµ� �������κ� ��ĭ. 0���� ���
		System.out.println("���� �� ��ĭ");
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

//5�����ϴµ� ���������κ� ��ĭ. 0���� ���
		System.out.println("������ �� ��ĭ");
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
