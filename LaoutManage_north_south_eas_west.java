import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class LaoutManage_north_south_eas_west {
	
	public static void main(String[] args) {
	
		
		JFrame frame = new JFrame();
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.orange);
        panel5.setBackground(Color.MAGENTA);
        
		
		panel1.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//////////////////ADD SUB PANEL IN THE CENTER///////////////////
		
        panel5.setLayout(new BorderLayout());
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
        panel6.setBackground(Color.black);
        panel7.setBackground(Color.pink);
        panel8.setBackground(Color.DARK_GRAY);
        panel9.setBackground(Color.lightGray);
        panel10.setBackground(Color.white);
        
		
		panel6.setPreferredSize(new Dimension(50,50));
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		
		
		panel5.add(panel6,BorderLayout.NORTH);
	    panel5.add(panel7,BorderLayout.EAST);
	    panel5.add(panel8,BorderLayout.WEST);
	    panel5.add(panel9,BorderLayout.SOUTH);
	    panel5.add(panel10,BorderLayout.CENTER);
	    
		
		
		
		
		
		
        //////////////////ADD SUB PANEL IN THE CENTER///////////////////
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,250);
		frame.setTitle("LayoutMananager");
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10,10));
		
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.EAST);
		frame.add(panel3,BorderLayout.WEST);
		frame.add(panel4,BorderLayout.SOUTH);
		frame.add(panel5,BorderLayout.CENTER);
	}

}
