package App;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegistrationTest1 {

	@Test
	
		public void testRegistrationObject() {
			Registration R=new Registration("Ivanov", "Ivan", 34, "ivan1980", "12345");
			assertEquals(R.getSurname(), "Ivanov");
	}

}
