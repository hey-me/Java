
public class D1006_ex {

	public static void main(String[] args) {

		
		int[] arr = {1, 1};
		
		for (int i = 0; i < 10; i++) {
			int []rearr = arr;
			arr = new int [i+3];
			System.arraycopy(rearr, 0, arr, 0, rearr.length);
			arr[i+2] = arr[i] + arr[i+1];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
