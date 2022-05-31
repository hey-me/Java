package _GUI.Project은행;

public class ex_Customer {

	String name;
	
	String tel;
	
	int number;

	
	String id;
	
	String password;

	public ex_Customer() {
	}
	
	ex_Customer(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public ex_Customer( String id, String password, String tel) {
		this.id = id;
		this.password = password;
		this.tel = tel;
	}

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "고객id"+id+"password"+password+"이름"+name;
	}
}