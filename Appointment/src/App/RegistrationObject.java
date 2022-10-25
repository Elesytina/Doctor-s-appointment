package App;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationObject {
	protected String Name;
	protected String Surname;
	protected int Age;
	protected static int counter;
	protected int ID;
	
	
	
	RegistrationObject(String Name, String Surname, int Age)
	{
	this.ID=counter++;
	this.Name=Name;
	this.Surname=Surname;
	this.Age=Age;
		
	}
	public int getID() 
	{
		return this.ID;
	}
	public void writeInfo()  throws Exception 
		{
			File dir1=new File("D:\\Clients.txt");
			int c=(new Counter()).getId(); ;
			 try(FileWriter writer = new FileWriter(dir1, true))
		    {   
		        String text = "ID"+this.getID()+" "+this.Surname+"  "+ this.Name +"  "+ 
		        this.Age;
		        writer.write(text);
		        writer.append('\n');          
		        writer.flush();
		    }
		    catch(IOException ex){         
		        System.out.println(ex.getMessage());
		    } 			
	}
}
