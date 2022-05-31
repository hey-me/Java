package _GUI.Project은행;

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

		File file = new File("C:/JavaSF/workspace/JavaSF/은행/" + id + "," + password + "/고객정보.txt");

		if (!file.exists()) {
			return "없음";
		} else {
			InputStream is = new FileInputStream("C:/JavaSF/workspace/JavaSF/은행/" + id + "," + password + "/고객정보.txt");
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
