package _GUI.Project����;

import java.io.*;
import java.util.*;

public class ex_����� {

	public static void main(String[] args) throws Exception {

//		CustomerComponent cc = new CustomerComponent();
//		String id= cc.idTf.getText();
		String id= "a";
		String password = "1234";
		String name = "���ڹ�";
		
		File customerID = new File("C:/JavaSF/workspace/JavaSF/����/"+id+","+password);
		if(!customerID.exists()) {
			customerID.mkdirs();
		}
		OutputStream os = new FileOutputStream("C:/JavaSF/workspace/JavaSF/����/"+id+","+password+"/����.txt");
		Writer writer = new OutputStreamWriter(os);
		
		Map<String, ex_Customer> map = new HashMap<String, ex_Customer>();
		map.put(name, new ex_Customer(id, password));
		
		writer.write(name+"\n");
		writer.write(id);
		
		writer.flush();
		writer.close();
		
		
		
		
		
		
	}

}
