package ch07_상속.d0930;

public class Ex01 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}

class TV {
	private static int size;
//	public TV() {}
	public TV(int size) {this.size = size; }
	protected int getSize() { return size; }
	
}

class ColorTV extends TV {
	
	private int color;
	
//	ColorTV(){}
	ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
	void printProperty (){
		System.out.println(getSize() +"인치 "+ color + "컬러");
	}
}