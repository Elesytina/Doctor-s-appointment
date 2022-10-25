package App;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import App.RegistrationForm;
import App.PersonalAreaForm;
import java.awt.*;

public class MenuForm extends JFrame {

	  	 private static final long serialVersionUID = 1L;
	  	
	  	  private JRadioButton radio1 = new JRadioButton("Регистрация");
	      private JRadioButton radio2 = new JRadioButton("Личный кабинет");
	      private JRadioButton radio3= new JRadioButton("Запись на приём");
	      
	      
	      private JButton button1 = new JButton("Выбрать");
	      public JPanel jpanel1;
	     

	  	public MenuForm() {
	  		super("Главное меню");
	  	     this.setBounds(250,250,450,450);
	  	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	     
	  	   Font BigFontTR = new Font("TimesRoman", Font.BOLD, 20);
	  	  
	  	     JPanel grid =new JPanel();
	           Container container = this.getContentPane();
	  	     container.setLayout(new GridLayout(4,2,4,4));
	  	     
	  	    Color c1 = new Color(90, 170, 200);
			Color c2 = new Color(200, 220, 200);
			
	  	     
	  	     /*Add radio to container*/
	  	     ButtonGroup group = new ButtonGroup();
	  	       group.add(radio1);
	  	       group.add(radio2);
	  	       group.add(radio3);
	  	       radio1.setBackground(c1);
	  	       radio2.setBackground(c2);
	  	       radio3.setBackground(c1);
	  	       
	  	       radio1.setFont(BigFontTR);
	  	       radio2.setFont(BigFontTR);
	  	       radio3.setFont(BigFontTR);
	  	       
	  	     container.add(radio1);
	  	     radio1.setSelected(true);
	  	     
	  	     container.add(radio2);
	  	     container.add(radio3);
	  	     
	  	     /*Add button*/
	  	     container.add(button1);
	  	     
	  	     button1.setBackground(Color.white);
	  	     button1.setFont(BigFontTR);
	  	     
	  	     container.setBackground(Color.blue);
	  	     
	  	     button1.addActionListener(new ButtonEventList());
	  	     		   
	  	}
	  	public  void disposeForm() {
			this.setVisible(false);
			
		}
	  	
	  	class ButtonEventList implements ActionListener {
	      	 public void actionPerformed(ActionEvent e) {
	      		 
	      		 if (radio1.isSelected())
	      		 {
	      			 RegistrationForm ap = new RegistrationForm();
	      				ap.setVisible(true);
	      			 MenuForm.this.disposeForm();	
	      				
	      		 }
	      		 else if (radio2.isSelected())
	      		 {
	      			PersonalAreaForm ap = new PersonalAreaForm();
	   				ap.setVisible(true);
	   				
	      		 }	
	      		 else
	      		 {
	      			 PersonalAreaForm ap = new PersonalAreaForm();
		   				ap.setVisible(true);
		   				
	      		 }
	      		 MenuForm.this.disposeForm();	
	      		 }
	      	 } 	 
	  	
	  	public static void main(String[] args) {
	  		MenuForm sameone=new MenuForm();
	  		sameone.setVisible(true);
	  		  		 
	  	}

	  }

	    
