import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Beobachter2 extends Addierer implements ActionListener {
	

	@Override
	public void actionPerformed(ActionEvent e) {

		
			int n1 = Integer.parseInt(t1.getText()); 
			int n2 = Integer.parseInt(t2.getText()); 
			
			
			String Ergebnis = String.valueOf(n1 * n2);
			
			t4.setText(Ergebnis);
		
		
	}

}
