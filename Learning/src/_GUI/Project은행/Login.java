package _GUI.Project����;

import java.io.*;

import java.util.*;


public class Login  {
	String name;
	String id;
	String password;
	String tel;

	Login(String id, String password) throws Exception {
		this.id = id;
		this.password = password;
		idread(id, password);
	}

	String idread(String id, String password) throws Exception {

		File file = new File("C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");

		if (!file.exists()) {
			return "����";
		} else {
			InputStream is = new FileInputStream("C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");
			Reader reader = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(reader);
			String retStr = "";
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				retStr += line + "\n";
			}
			return line;
		}
//		char[] buffer = new char[100];
//		
//		int readCharNum = reader.read(buffer);
//		reader.close();
//		String data = new String(buffer, 0, readCharNum);
//		return data;
	}

	public static void main(String[] args) {

	}

}
