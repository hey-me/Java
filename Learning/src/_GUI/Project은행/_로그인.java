package _GUI.Project은행;

import java.io.*;
import java.util.*;

public class _로그인 extends ex_Customer {
	String name;
	String id;
	String password;
	String tel;
	
	public _로그인() throws Exception {
		
		InputStream is = new FileInputStream("C:/JavaSF/workspace/JavaSF/은행/" + id + "," + password + "/고객정보.txt");
		Reader reader = new InputStreamReader(is);
		
		while(true) {
			int data = reader.read();
			if(data==-1) {break;}
			System.out.println(data);
		}
		
	}
	
	_로그인(String id, String password) {
		this.id = id; this.password = password;
	}
	
	public static void main(String[] args) {
		
	}

}
