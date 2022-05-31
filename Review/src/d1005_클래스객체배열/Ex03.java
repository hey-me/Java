package d1005_클래스객체배열;

public class Ex03 {

	public static void main(String[] args) {
		Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		song.show();
	}

}

class Song {
	String title, artist, country;
	int year;
	
	public Song() {}
	public Song(int year, String country, String artist, String title) {
		this.year = year; this.country = country; this.artist = artist; this.title = title;
	}
	void show () {
		System.out.println(year+ "년 " + country + "국적의 "+ artist + "가 부른 "+ title);
	}
}