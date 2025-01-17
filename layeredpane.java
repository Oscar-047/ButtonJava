package Study;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class layeredpane {

	public static void main(String[] args) {
		
		
	JFrame frame = new JFrame();
	
	
	JLayeredPane layeredpane = new JLayeredPane();
	layeredpane.setBounds(0,0,500,500);
	
	JLabel label1 = new JLabel();
	label1.setBackground(Color.RED);
	label1.setBounds(50,50,200,200);
	label1.setOpaque(true);
	
	JLabel label2 = new JLabel();
	label2.setBackground(Color.BLUE);
	label2.setBounds(100,100,200,200);
	label2.setOpaque(true);
	
	JLabel label3 = new JLabel();
	label3.setBackground(Color.GREEN);
	label3.setBounds(150,150,200,200);
	label3.setOpaque(true);
	
	layeredpane.add(label1);
	layeredpane.add(label2);
	layeredpane.add(label3);
	
	
		
		
		
		frame.setTitle("LayeredPan");
		frame.setSize(500,500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(layeredpane);
		
	
		
		
		
		
		frame.setVisible(true);
		
		
		
	
	}
}
