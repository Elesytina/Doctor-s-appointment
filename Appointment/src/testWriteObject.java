import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import org.junit.Test;

import App.RegistrationForm;

public class testWriteObject {

	@SuppressWarnings("static-access")
	@Test
	public void test() throws Throwable {
		RegistrationForm rgf=new RegistrationForm();
		rgf.getInputSurname().setText("Potapovitch");
		rgf.getInputName().setText("Potap");
		rgf.getInputAge().setText("23");
		rgf.getInputLogin().setText("Potap23");
		rgf.getInputPassword().setText("1234456");
		try {
			RegistrationForm.ButtonEventList1.writeData();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 FileReader fr= new FileReader("D:\\Clients.txt");
         Scanner scan = new Scanner(fr);
         RandomAccessFile file = new RandomAccessFile("D:\\Clients.txt", "r");
			String str;
			while ((str = file.readLine()) != null) {
				System.out.println(str);
				boolean isContains1 = str.contains("Potapovitch"+"  "+"Potap"+"  "+"23");
				if(isContains1) {
		        assertEquals(isContains1,true); 
		        break;
		        }   	 
                }
			file.close();			        		  
            fr.close();
	} 

	}