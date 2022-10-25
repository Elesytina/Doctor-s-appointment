package App;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class AccountForm  extends JFrame {

 	 private static final long serialVersionUID = 1L;
 	
 	 private JRadioButton radio1 = new JRadioButton("Запись на приём");
     private JRadioButton radio2 = new JRadioButton("Просмотр записей на приём");
     private JRadioButton radio3= new JRadioButton("Отменить запись на приём");   
     private JButton button1 = new JButton("Выбрать");
     public JPanel jpanel1;
    

 	public AccountForm() {
 		super("Личный кабинет. Выбор нужного действия");
 	     this.setBounds(300,300,400,400);
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
 	       radio1.setBackground(c2);
 	       radio2.setBackground(c1);
 	       radio3.setBackground(c2);
 	       
 	       radio1.setFont(BigFontTR);
 	       radio2.setFont(BigFontTR);
 	       radio3.setFont(BigFontTR);
 	       
 	     container.add(radio1);
 	     radio1.setSelected(true);
 	     
 	     container.add(radio2);
 	     container.add(radio3);
 	     
 	     /*Add button*/
 	     container.add(button1);
 	     
 	     button1.setBackground(Color.gray);
 	     button1.setFont(BigFontTR);
 	     
 	     container.setBackground(Color.white);
 	     
 	     button1.addActionListener(new ButtonEventList());
 	     		   
 	}
 	public  void disposeForm() {
		this.setVisible(false);		
	}
 	
 	class ButtonEventList implements ActionListener {
     	 public void actionPerformed(ActionEvent e) {
     		 
     		 if (radio1.isSelected())
     		 {
     			 BookForm bf = new BookForm();
     				bf.setVisible(true);
     			 	
     				
     		 }
     		 else if (radio2.isSelected())
     		 {
     			 JOptionPane.showMessageDialog(null,  "Нет доступных записей на приём ");
  				
     		 }	
     		 else
     		 {
     			 
     			 JOptionPane.showMessageDialog(null,  "Нет доступных записей на приём ");
   				
     		 }
     		 
     		 }
     	 } 	 
 	
 }
