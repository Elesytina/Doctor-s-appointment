package App;

	import java.awt.Color;
    import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.nio.file.Paths;
import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.GregorianCalendar;
	import java.util.Locale;
	import java.util.Objects;
import java.util.Scanner;

import javax.swing.ButtonGroup;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JRadioButton;
	import javax.swing.JTextField;

	public class PersonalAreaForm extends JFrame {
	       
			private JLabel Login = new JLabel("Логин");
		    protected static JTextField inputLogin = new JTextField("",20);
		    
		    private JLabel Password = new JLabel("Пароль ");
		    protected static JTextField inputPassword = new JTextField("",20);
		    
		    private JButton button = new JButton("Авторизироваться");
		    
		    public PersonalAreaForm()  {
		    	 super("Вход в личный кабинет");
			     this.setBounds(350,300,350,350);
			     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        Color c1 = new Color(150, 150, 180);
					Color c2 = new Color(90, 220, 200);
					Font BigFontTR = new Font("TimesRoman", Font.BOLD, 18);
			  
			     JPanel grid =new JPanel();
		         Container container = this.getContentPane();
			     container.setLayout(new GridLayout(10,3,4,4));
			     container.setBackground(c1);
			     	  
			     container.add(Login);
			     container.add(inputLogin);
			     Login.setFont(BigFontTR);
			    
			     container.add(Password);
			     container.add(inputPassword);
			     Password.setFont(BigFontTR);
			     		     
			     button.addActionListener(new ButtonEventList1());
			     container.add(button);
			     button.setBackground(c2);
			     button.setFont(BigFontTR);
		    }
		    // Конец конструктора класса PersonalAreaForm
		    // Метод класса PersonalAreaForm
			     public static boolean readData() throws Exception
				 {
			    	 boolean isContains=false;
			    	 boolean x;
			         FileReader fr= new FileReader("D:\\Clients.txt");
			         Scanner scan = new Scanner(fr);
			        
			         RandomAccessFile file = new RandomAccessFile("D:\\Clients.txt", "r");
						String str;
						int r=0;
						while ((str = file.readLine()) != null) {
							System.out.println(str);
							isContains = str.contains(PersonalAreaForm.inputLogin.getText()+PersonalAreaForm.inputPassword.getText());	
							if(isContains) {
					        	r++;						    	
						    }
				        }
						if (r>0)
							x=true;
						else
							x=false;
						System.out.println(x);	
				return x;		
	        }
			     //Конец метода класса PersonalAreaForm
			     public  void disposeForm() {
						this.setVisible(false);
						
					}
			    
			     // Внутренний класс ButtonEventList1
			     class ButtonEventList1 implements ActionListener {
			     	 public void actionPerformed(ActionEvent e) {
						  boolean bo=false;
						 if ((PersonalAreaForm.inputLogin.getText().equals(""))||(PersonalAreaForm.inputPassword.getText().equals("")))
						 { JOptionPane.showMessageDialog(null,
			                        "Введите логин и пароль ");
						  return;
			     		   }	 
						 else {
						      try {
								bo= PersonalAreaForm.readData();
							} catch (Exception e1) {
							
								e1.printStackTrace();
							}
						      if(bo) {
		  	     		    	AccountForm acc=new AccountForm();
		  	     		        acc.setVisible(true);
		  	     		    	PersonalAreaForm.this.disposeForm();
						      }
						      else 
						      { JOptionPane.showMessageDialog(null,
				                        "Введён неправильный логин или пароль ");
							  return;
				     		   }	
				     	} 
						//   Конец блока else                          			     		    		     	 
			    }	
			     	 // Конец метода
		}
			      // Конец внутреннего класса	
			     }
			  
	

