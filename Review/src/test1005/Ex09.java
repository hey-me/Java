package test1005;

public class Ex09 {

	public static void main(String[] args) {
		
		int [] array1 = {1,5,7,9};
		int [] array2 = {3,6,-1,100,77};
		int [] array3 = ArrayUtil.concat(array1, array2);
//		ArrayUtil.print(array3);
//		ArrayUtil au=new ArrayUtil();
		for(int a:array3)
			System.out.print(a+" ");
//		for (int i = 0; i < array3.length; i++) {
//			System.out.print(au.concat(array1, array2)[i]+" ");
		
//		System.out.println(au.concat(array1, array2));
//		System.out.println(ArrayUtil.concat(array1,array2));	
	}

}

class ArrayUtil{
	
	public static int [] concat(int[]a, int[]b) {
		int[]n=new int[a.length+b.length];
		
		System.arraycopy(a, 0, n, 0, a.length);
		System.arraycopy(b, 0, n, a.length, b.length);
		
		return n;
//		for (int i = 0; i < a.length; i++) {
//			n[i]=a[i];
//		}
//		for (int i = a.length; i < n.length; i++) {
//			n[i]=b[i-a.length];
//		}
//		return n;
	}
	
	public static void print(int[]a) {
		for(int y:a)
			System.out.print(y+ " ");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
	}
	
	
}