package d0827;

public class D0830_Test_16 {

	public static void main(String[] args) {

		int[] ar = new int[10];
		int[] br = new int[10];
		int[] cr = new int[20];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 100 + 1);
			br[i] = (int) (Math.random() * 100 + 1);
		}
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[j] < ar[i]) {
					int imsi = ar[j];
					ar[j] = ar[i];
					ar[i] = imsi;
				}
			}
		}
		for (int i = 0; i < br.length - 1; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (br[j] < br[i]) {
					int imsi = br[j];
					br[j] = br[i];
					br[i] = imsi;
				}
			}
		}
		int arcnt = 0, brcnt = 0;
		for (int i = 0; i < cr.length; i++) {
//			if (arcnt < 10 && brcnt < 10) {
			if (ar[arcnt] >= br[brcnt]) {
				cr[i] = br[brcnt++];
				if (brcnt >= 10) {
					br[--brcnt] = 1999999;
				}
			} else {
				cr[i] = ar[arcnt++];
				if (arcnt >= 10) {
					ar[--arcnt] = 1999999;
				}
			}
//			}
		}

		for (int i = 0; i < cr.length; i++) {
			System.out.print(cr[i] + " ");
		}
		System.out.println();
		System.out.println("ar0 " + ar[0]);
		System.out.println("br0 " + br[0]);
		System.out.println("cr0 " + cr[0]);
		System.out.println("ar1 " + ar[1]);
		System.out.println("br1 " + br[0]);
		System.out.println("cr1 " + cr[1]);
	}

}
