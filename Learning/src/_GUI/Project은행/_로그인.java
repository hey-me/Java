package _GUI.Project����;

import java.io.*;
import java.util.*;

public class _�α��� extends ex_Customer {
	String name;
	String id;
	String password;
	String tel;
	
	public _�α���() throws Exception {
		
		InputStream is = new FileInputStream("C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");
		Reader reader = new InputStreamReader(is);
		
		while(true) {
			int data = reader.read();
			if(data==-1) {break;}
			System.out.println(data);
		}
		
	}
	
	_�α���(String id, String password) {
		this.id = id; this.password = password;
	}
	
	public static void main(String[] args) {
		
	}

}
