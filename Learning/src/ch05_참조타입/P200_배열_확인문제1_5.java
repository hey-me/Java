package ch05_����Ÿ��;

public class P200_�迭_Ȯ�ι���1_5 {

	public static void main(String[] args) {

//	1��.	2	
//	2��.	3
//	3��.	3, 5

//	4��.	
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		// �ۼ���ġ
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		//
		System.out.println("max = " + max);

//	5��.	
		int[][] array2 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		// �ۼ���ġ
		int cnt = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				sum += array2[i][j];
				cnt++;
			}
		}
		avg = (double) sum / cnt;
		//
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
