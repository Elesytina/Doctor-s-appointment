package App;

import java.util.Objects;

public class Registration {
	protected String Surname;
	protected String Name;
	protected Integer Age;
	protected  String Login;
	protected  String Password;
	/*Constructor*/
	public Registration(String Surname, String Name, Integer Age, String Login, String Password) {
		this.Surname= Surname;
		this.Name = Name;
		this.Age= Age;
		this.Login=Login;
		this.Password=Password;
		
	}
	public String getSurname()
	{
		return this.Surname;
	}
	public Boolean equals(Registration R) 
	{
		return R.Surname==this.Surname && R.Name==this.Name && R.Age==this.Age && R.Login==this.Login && R.Password==this.Password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Age, Login, Name, Password, Surname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		return Objects.equals(Age, other.Age) && Objects.equals(Login, other.Login) && Objects.equals(Name, other.Name)
				&& Objects.equals(Password, other.Password) && Objects.equals(Surname, other.Surname);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
