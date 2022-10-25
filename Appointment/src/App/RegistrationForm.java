package App;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Calendar.DateTextField;



public class RegistrationForm extends JFrame {
		private JLabel Surname = new JLabel("Фамилия ");
	    protected static JTextField inputSurname = new JTextField("",20);
	    
		private JLabel Name = new JLabel("Имя ");
	    protected static  JTextField inputName = new JTextField("",20);
	    private JLabel Age = new JLabel("Возраст ");
	    protected static JTextField inputAge=new JTextField("", 3);
	    
	    private JLabel Login = new JLabel("Логин ");
	    protected static JTextField inputLogin = new JTextField("",15);
	    private JLabel Password = new JLabel("Пароль должен содержать не менее 5  и не более 15 символов ");
	    protected static JTextField inputPassword = new JTextField("",15);
	    protected int i=0;
	    Font BigFontTR = new Font("TimesRoman", Font.BOLD, 16);
	   
	    private JButton button1 = new JButton("Зарегистрироваться");
	   
	    protected JButton button2 = new JButton("Авторизация");
	    protected Counter counter;
	    
	    public RegistrationForm() {
	         super("Регистрация");
		     this.setBounds(100,100,650,650);
		     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        Color c1 = new Color(100,150,200);
				Color c2 = new Color(150, 220, 100);  
				Color c3 = new Color(250, 90, 150);
			    Color c4= new Color(110, 220, 100);
		     JPanel grid =new JPanel();
	         Container container = this.getContentPane();
		     container.setLayout(new GridLayout(20,5,4,4));
		     container.setBackground(c1);
		     
		     	  
		     container.add(Surname);
		     container.add(getInputSurname());
		     Surname.setFont(BigFontTR);
		    
		     container.add(Name);
		     container.add(inputName);
		     Name.setFont(BigFontTR);
		     
		     container.add(Age);
		     container.add(inputAge);
		     Age.setFont(BigFontTR);
		      
		     container.add(Login);
		     container.add(inputLogin);
		     Login.setFont(BigFontTR);
		     
		     container.add(Password);
		     container.add(inputPassword);
		     Password.setFont(BigFontTR);
		  
		     button1.addActionListener(new ButtonEventList1());
		     container.add(button1);
		     button2.addActionListener(new ButtonEventList2());
		     container.add(button2);
		     button1.setBackground(c4);
		     button2.setBackground(c2);
		     button1.setFont(BigFontTR);
		     button2.setFont(BigFontTR);
		     
	    }
	    
	 // Блок сеттеров и геттеров класса RegistrationForm   	     		  
		 public static JTextField getInputSurname() {
			return inputSurname;
		}
		public static void setInputSurname(JTextField inputSurname) {
			RegistrationForm.inputSurname = inputSurname;
		}

		public static JTextField getInputName() {
			return inputName;
		}

		public static void setInputName(JTextField inputName) {
			RegistrationForm.inputName = inputName;
		}

		public static JTextField getInputAge() {
			return inputAge;
		}

		public static void setInputAge(JTextField inputAge) {
			RegistrationForm.inputAge = inputAge;
		}

		public static JTextField getInputLogin() {
			return inputLogin;
		}

		public static void setInputLogin(JTextField inputLogin) {
			RegistrationForm.inputLogin = inputLogin;
		}

		public static JTextField getInputPassword() {
			return inputPassword;
		}

		public static void setInputPassword(JTextField inputPassword) {
			RegistrationForm.inputPassword = inputPassword;
		}
		// Конец блока сеттеров и геттеров
		
		public  void disposeForm() {
			this.setVisible(false);
			
		}
		// Метод класса RegistrationForm
public static int writeData() throws Exception 
{
	File dir1=new File("D:\\Clients.txt");
	int c=(new Counter()).getId(); ;
	 try(FileWriter writer = new FileWriter(dir1, true))
    {   
		
        String text = "ID"+c+" "+RegistrationForm.inputSurname.getText()+"  "+ RegistrationForm.inputName.getText() +"  "+ 
        RegistrationForm.inputAge.getText()+ "  " +RegistrationForm.inputLogin.getText()+RegistrationForm.inputPassword.getText();
        writer.write(text);
        writer.append('\n');          
        writer.flush();
        if(dir1.exists()) 
       System.out.println("Have done!");
    }
    catch(IOException ex){
         
        System.out.println(ex.getMessage());
    } 
	 return c;
} 
// Конец метода

// Класс ButtonEventList1
		public static    class ButtonEventList1 implements ActionListener {
		     	 public void actionPerformed(ActionEvent e) {

		     		  if (inputSurname.getText().equals("")) { JOptionPane.showMessageDialog(null,
		                        "Заполните все поля! ");return ;
		     		    }
		     		   if (inputName.getText().equals("")) { JOptionPane.showMessageDialog(null,
		                        "Заполните все поля!  ");return ;
		     		   }
		               if (inputAge.getText().equals("")) { JOptionPane.showMessageDialog(null,
		    	                        "Заполните все поля!  ");return ;
		     		   }
		               if (inputLogin.getText().equals("")) { JOptionPane.showMessageDialog(null,
   	                        "Заполните все поля!  ");return ;
		               }
   	                   if (inputPassword.getText().equals("")) { JOptionPane.showMessageDialog(null,
	    	                        "Заполните все поля!  ");return ;
   	                   }
   	                   if((inputPassword.getText().length()<5) || (inputPassword.getText().length()>15)) {
   	                	JOptionPane.showMessageDialog(null,
    	                        " Пароль должен содержать от 5 до 15 символов включительно!!");
   	                	return ;
   	                   }
   	                   if((Integer.parseInt(inputAge.getText())<0)||(Integer.parseInt(inputAge.getText())>120)) {
   	                	JOptionPane.showMessageDialog(null,
    	                        " Введите корректный возраст- количество полных лет ");
   	                	return ;
		     	         }
		               
		     		   else
		     			{   		     			      			 
		     				try {	
		     					RegistrationForm.writeData();
								Registration X=new Registration(inputSurname.getText(), inputName.getText(), Integer.parseInt(inputAge.getText()), 
										inputLogin.getText(), inputPassword.getText());	
								
							} 
		     				catch (ParseException e1) {
						
								e1.printStackTrace();
								
							} catch (Exception e1) {
								
								e1.printStackTrace();
								
							}	 
		     				
				     		JOptionPane.showMessageDialog(null,"Регистрация пройдена!");
				     		RegistrationObject ro=new RegistrationObject(inputName.getText(),inputSurname.getText(),Integer.parseInt(inputAge.getText()));

		     	 } 	 
		     	 }
		}
		     	 
		     	 // Конец класса ButtonEventList1
		     	 
		// Внутренний класс ButtonEventList2
		     class ButtonEventList2 implements ActionListener {
		     	 public void actionPerformed(ActionEvent e) { 
		     				try {
		     					PersonalAreaForm ap = new PersonalAreaForm();
		    	   				ap.setVisible(true);
		    	   				RegistrationForm.this.disposeForm();
		     				} 
		     				catch (Exception e1) {
		     					e1.printStackTrace();
		     				}
		  	     		    System.out.println(" Login ");  
		     	 }
	}
		     // Конец внутреннего класса
}     

