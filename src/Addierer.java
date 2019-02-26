
import java.awt.*;
import java.awt.event.*;
     
 
 class Addierer extends Frame {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Button b1;
	protected Button b2;
	protected Button b3;
	protected Button b4;
	
    protected TextField t1,t2,t3;
    
     
     public Addierer() {
         setLayout(new FlowLayout());
         setSize(600,400);
         setLocationRelativeTo(null);
                 
         b1 = new Button("add");
         b2 = new Button("substract");
         b3 = new Button("divide");
         b4 = new Button("multiply");

         
		 t1 = new TextField("4",4);
		 t2 = new TextField("2",4);
             t3 = new TextField(4);
             t3.setEditable(false);
           
             add(t1);
             add(t2);
             add(t3);
             add(b1); 
             add(b2); 
             add(b3); 
             add(b4); 

             
             
             /*
              * First way to implement ActionListenerin constructor
	         b1.addActionListener(new ActionListener () { 
	      		@Override
				public void actionPerformed(ActionEvent e) {
	      			
	      			int n1 = Integer.parseInt(t1.getText()); 
	      			int n2 = Integer.parseInt(t2.getText()); 
	      			
	      			
	      			String Ergebnis = String.valueOf(n1 + n2);
	      			
	      			t3.setText(Ergebnis);
					
	      			} 
	      			      		
	        	 });
	        	 å
	        	 */
	         
 	
           }
     
 }
     
     