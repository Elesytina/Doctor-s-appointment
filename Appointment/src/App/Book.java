package App;

import java.util.Date;

public class Book
{
	protected Date DateOfBook;
	protected Specialist Specialist;
	protected String NameOfSpecialist;
	
	public Book(Date DateOfBook, Specialist Specialist, String NameOfSpecialist) {
		this.DateOfBook=DateOfBook;
		this.Specialist=Specialist;
		this.NameOfSpecialist=NameOfSpecialist;
		
	}
}


