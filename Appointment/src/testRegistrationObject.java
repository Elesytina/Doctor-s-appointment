import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import App.Registration;

public class testRegistrationObject {

	@Test
	public void testRegistrationObject() {
		Registration R=new Registration("Ivanov", "Ivan", 34, "ivan1980", "12345");
		assertEquals(R.getSurname(), "Ivanov");
		assertEquals(R.getName(),"Ivan");
		
	}
	

}
