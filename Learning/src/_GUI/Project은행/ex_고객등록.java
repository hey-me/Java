package _GUI.Project은행;

import java.io.*;
import java.util.*;

public class ex_고객등록 {

	public static void main(String[] args) throws Exception {

//		CustomerComponent cc = new CustomerComponent();
//		String id= cc.idTf.getText();
		String id= "a";
		String password = "1234";
		String name = "김자바";
		
		File customerID = new File("C:/JavaSF/workspace/JavaSF/은행/"+id+","+password);
		if(!customerID.exists()) {
			customerID.mkdirs();
		}
		OutputStream os = new FileOutputStream("C:/JavaSF/workspace/JavaSF/은행/"+id+","+password+"/계좌.txt");
		Writer writer = new OutputStreamWriter(os);
		
		Map<String, ex_Customer> map = new HashMap<String, ex_Customer>();
		map.put(name, new ex_Customer(id, password));
		
		writer.write(name+"\n");
		writer.write(id);
		
		writer.flush();
		writer.close();
		
		
		
		
		
		
	}

}
