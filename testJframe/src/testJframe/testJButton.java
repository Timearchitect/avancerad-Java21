package testJframe;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class testJButton {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.getContentPane().setBackground(  new Color(255,100,100)   );
		
		JButton btn= new JButton();
		btn.setBounds(0, 50, 200, 200); // x, y, width , height
		btn.setText("calculate");
		frame.add(btn);
		
		ActionListener ac = new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println("hello");
		    }
		};
		
		btn.addActionListener(ac );
	}

}
