import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AddiererTest {
	
	     public static void main(String argv[]) {
	         Beobachter f = new Beobachter();
	         
	         
	         f.addWindowListener(new WindowAdapter () {
	            
	        	 public void windowClosing (WindowEvent e) {
	                 System.exit(0);
	        	 	} 
	        	 });
	         
	         
	       
	         
	         	f.setVisible(true);
			
	       

	     }
	     
     
     

}
