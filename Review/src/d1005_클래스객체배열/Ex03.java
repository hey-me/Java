package d1005_Ŭ������ü�迭;

public class Ex03 {

	public static void main(String[] args) {
		Song song = new Song(1978, "������", "ABBA", "Dancing Queen");
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
		System.out.println(year+ "�� " + country + "������ "+ artist + "�� �θ� "+ title);
	}
}