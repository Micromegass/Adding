
 import java.awt.*;
 import java.awt.event.*;



public class Beobachter extends Addierer implements ActionListener {
	
	   Beobachter () {
         b1.addActionListener(this);
	 	}
	   
		public void actionPerformed(ActionEvent e) {  
			
			
			try {
				
				int n1 = Integer.parseInt(t1.getText()); 
      			int n2 = Integer.parseInt(t2.getText()); 
      			
      			
      			String Ergebnis = String.valueOf(n1 + n2);
      			
      			t3.setText(Ergebnis);
				
			} catch(NumberFormatException ex) {
				
				System.out.print("Input not allowed" + ex.getMessage());
				
				
			}
		
		
		
		}
		
	}