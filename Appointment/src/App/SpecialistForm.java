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
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import App.BookForm.ButtonEventList1;
import Calendar.DateTextField;

public class SpecialistForm  extends JFrame {

		
	    private JLabel Hour = new JLabel("Выберите время");
	    	   
	    
	    private static String[] time= {
	    		"8.00","8.30","9.00","9.30","10.00","10.30","11.00","11.30","12.00","12.30","13.00","13.30","14.00","14.30","15.00","15.30","16.00",
	    		"16.30","17.00","17.30","18.00","18.30","19.00","19.30","20.00"
	    };
	   	     
	     private static String[] NameOfTherapist= {"Иванов Иван Иванович",
		   		  "Петрова Ольга Сергеевна",
				  "Киселев Олег Игоревич",
				  "Шульц Валентина Петровна",
				  "Ворон Павел Алексеевич"};
	     
	     private String[] NameOfSurgeon= {"Петров Павел Васильевич", "Кудрявцева Ольга Семёновна", "Большов Игорь Иванович"};
	     private String[] NameOfOphthalmologist= {"Кац Максим Петрович", "Меленева Юлия Сергеевна"};
	     private String[] NameOfOtorinolaring= {"Фет Яна Петровна", "Моле Юрий Сергеевич"};
	     private String[] NameOfPediatrist= {"Ложкова Яна Максимовна", "Ветров Владимир Алексеевич"};
	     private String[] NameOfUSD= {"Петров Ярослав Игоревич", "Машков Терентий Сергеевич", "Алешкина Полина Константиновна"};
	     private String[] NameOfGinekologist= {"Фурс Марина Петровна", "Ноткина Юлия Матвеевна"};
	     private String[] NameOfPhysition= {"Кет Марина Петровна", "Юраш Юлия Федоровна"};

	     
	     private static  JComboBox inputTime = new JComboBox(time);
	     
	 	     
	    private JLabel SpecialistFullName= new JLabel("ФИО врача-специалиста");
	    protected static  JComboBox inputSpecialistFullName = new JComboBox(NameOfTherapist);
	    
	   
	    private JButton button = new JButton("Подтвердить");
	    
	    public SpecialistForm() {
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
		  
		     
		     container.add(Hour);
		     Hour.setFont(BigFontTR);  
		     container.add(inputTime);
		     
		     container.add(SpecialistFullName);  
		     SpecialistFullName.setFont(BigFontTR);
		    
		     container.add(inputSpecialistFullName); 
		     
		    	     
		     button.addActionListener(new ButtonEventList1());
		     container.add(button);
		     button.setFont(BigFontTR);
		     grid.setVisible(true);
	    }
	    
	    public SpecialistForm(int y) {
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
		  
		     
		     container.add(Hour);
		     Hour.setFont(BigFontTR);  
		     container.add(inputTime);
		     
		     
		     container.add(SpecialistFullName);  
		     SpecialistFullName.setFont(BigFontTR);
		    
		     if (y==1)
		         container.add(inputSpecialistFullName); 
		     else if(y==2)
		    	 container.add(new JComboBox(NameOfSurgeon));
		     else if(y==3)
		    	 container.add(new JComboBox(NameOfOphthalmologist));
		     else if(y==4)
		    	 container.add(new JComboBox(NameOfOtorinolaring));
		     else if(y==5)
		    	 container.add(new JComboBox(NameOfPediatrist));
		     else if(y==6)
		    	 container.add(new JComboBox(NameOfUSD));
		     else if(y==7)
		    	 container.add(new JComboBox(NameOfGinekologist));
		     else if(y==8)
		    	 container.add(new JComboBox(NameOfPhysition));
		     		    	     
		     button.addActionListener(new ButtonEventList1());
		     container.add(button);
		     button.setFont(BigFontTR);
		     grid.setVisible(true);
	    }
		     
	    
	    public  void disposeForm() {
			this.setVisible(false);
			
		}
	    /**
	     * @throws Exception
	     */
	    public static void writeData() throws Exception 
	    {
	    	File dir1=new File("D:\\ClientsAppointment.txt");
	    	 try(FileWriter writer = new FileWriter(dir1, true))
	        {  
	            String text = BookForm.chooseDate.getText()+" "+ SpecialistForm.inputTime.getSelectedItem()+ "  Вы записаны на приём  к  врачу  "+ 
	        SpecialistForm.inputSpecialistFullName.getSelectedItem();
	            writer.write(text);
	            writer.append('\n');          
	            writer.flush();
	            if(dir1.exists()) 
	           System.out.println("Have done!");
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        } 
	    } 
		class ButtonEventList1 implements ActionListener {
	     	 public void actionPerformed(ActionEvent e) {
	     	      		     			 
	     			  JOptionPane.showMessageDialog(null,  "Запись подтверждена ");
	     			  SpecialistForm.this.disposeForm();
	     			  try {
							SpecialistForm.writeData();
						} catch (Exception e1) {
						
							e1.printStackTrace();
						}
	     	 }
	     	 
	    }
}




