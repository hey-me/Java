package test1005;

public class Ex03 {

	public static void main(String[] args) {
		
		Song what=new Song("Dancing Queen","ABBA",1978,"������");
		what.show();
	}

}

class Song{
	String title;
	String artist;
	int year;
	String country;
	
	Song(){
		
		}
	
	Song(String title, String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	void show(){
		System.out.println(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}

}