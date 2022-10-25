package App;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import Calendar.DateTextField;
import Calendar.DateTextField.*;

public class BookForm extends JFrame {
        
		private JLabel Date = new JLabel("Дата");	    
	     private static String[] spec= {"терапевт",
	   		  "хирург",
			  "офтальмолог",
			  "педиатр",
			  "оториноларинголог", "гинеколог", "УЗИ-диагност", "Физиотерапевт"};
	     
	     private JLabel Specialist= new JLabel("Специальность врача");
		 protected static JComboBox inputSpecialist = new JComboBox(spec);
	     
	    
	    protected static DateTextField chooseDate=new DateTextField(new java.util.Date());
	    private JButton button = new JButton("Записаться");
	    
	    public BookForm() {
	    	super("Запись на приём");
		     this.setBounds(300,300,550,550);
		     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        Color c1 = new Color(250, 220, 190);
				Color c2 = new Color(90, 170, 200);		        
				Color c3 = new Color(0xff000000 | (0xc0 << 16) | (0x00 << 8) | 0x00);
				 Font BigFontTR = new Font("TimesRoman", Font.BOLD, 16);
		  
		     JPanel grid =new JPanel();
	         Container container = this.getContentPane();
		     container.setLayout(new GridLayout(10,5,4,4));
		     container.setBackground(c2);
		     button.setBackground(c3);
		     button.setFont(BigFontTR);
		  
		     container.add(Date);	
		     Date.setFont(BigFontTR);
		     container.add(chooseDate);
		     
		    
		     container.add(Specialist);  
		     Specialist.setFont(BigFontTR);
		     container.add(inputSpecialist);
	

		     button.addActionListener(new ButtonEventList1());
		     container.add(button);
		     button.setFont(BigFontTR);
		     grid.setVisible(true);
		     
	    }
	    public  void disposeForm() {
			this.setVisible(false);
			
		}
	    
	    class ButtonEventList1 implements ActionListener {
	     	 public void actionPerformed(ActionEvent e) {     	
	     		BookForm.this.disposeForm();
	     		 if (inputSpecialist.getSelectedItem().toString()=="терапевт") {  			 
	     			  SpecialistForm sp=new SpecialistForm(1);
	     			  sp.setVisible(true);
	     			
	     			  }
	     		 else if (inputSpecialist.getSelectedItem().toString()=="хирург") {  			 
	     			  SpecialistForm sp=new SpecialistForm(2);
	     			  sp.setVisible(true);
	     			  }
	     		 else if (inputSpecialist.getSelectedItem().toString()=="офтальмолог") {  			 
	     			  SpecialistForm sp=new SpecialistForm(3);
	     			  sp.setVisible(true);
	     			  }
	     		 else if (inputSpecialist.getSelectedItem().toString()=="педиатр") {  			 
	     			  SpecialistForm sp=new SpecialistForm(5);
	     			  sp.setVisible(true);
	     			  }
	     		 else if (inputSpecialist.getSelectedItem().toString()=="УЗИ-диагност") {  			 
	     			  SpecialistForm sp=new SpecialistForm(6);
	     			  sp.setVisible(true);
	     			  }
	     		 else if (inputSpecialist.getSelectedItem().toString()=="оториноларинголог") {  			 
	     			  SpecialistForm sp=new SpecialistForm(4);
	     			  sp.setVisible(true);
	     			  }
	     		 else if (inputSpecialist.getSelectedItem().toString()=="гинеколог") {  			 
	     			  SpecialistForm sp=new SpecialistForm(7);
	     			  sp.setVisible(true);
	     			  }
	     		else if (inputSpecialist.getSelectedItem().toString()=="Физиотерапевт") {  			 
	     			  SpecialistForm sp=new SpecialistForm(8);
	     			  sp.setVisible(true);
	     			  }
	     		 
	     	 }
	     	 public void readData() throws Exception
			 {
		         FileReader fr= new FileReader("D:\\Clients.txt");
		         Scanner scan = new Scanner(fr);
		         RandomAccessFile file = new RandomAccessFile("D:\\Clients.txt", "r");
					String str;
					while ((str = file.readLine()) != null) {
						System.out.println(str);
					}
					file.close();	        		  
		         fr.close();

	            }
	    }
}




