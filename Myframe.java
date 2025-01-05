import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame implements ActionListener {
    
    JButton button; 

    Myframe(){
        button = new JButton(); // Corrected this line to assign to the class variable
        button.setBounds(200, 100, 100, 50);
        button.setText("Click Me");
        button.setFocusable(false);
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(250,250);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("Yessir");
        }
    }

    public static void main(String[] args) {
        new Myframe();
    }
}
