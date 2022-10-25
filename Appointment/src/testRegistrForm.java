import static org.junit.Assert.*;

import org.junit.Test;

import App.RegistrationForm;

public class testRegistrForm {

	@Test
	public void test() {
		RegistrationForm reg=new RegistrationForm();
		reg.setVisible(true);
		
	}
	public static void main(String args[]) 
	{
		testRegistrForm tr= new testRegistrForm();
		tr.test();
	}

}
