package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if(rand == 0){
			JOptionPane.showMessageDialog(null, "You are going to have a plesant surprize in exactly 42 hours, 12 minutes, and 36 seconds ");
		}
		if(rand == 1){
			JOptionPane.showMessageDialog(null, "There is a present that has just been sent today- EXPECTED ARRIVAL IS 5-7 BUSINESS DAYS ");
		}
		if(rand == 2){
			JOptionPane.showMessageDialog(null, "You should enjoy your day today... it could plausably be your last ");
		}
		if(rand == 3){
			JOptionPane.showMessageDialog(null, "You should learn how to play a diggerido or you will regret it ");
		}
		if(rand == 4){
			JOptionPane.showMessageDialog(null, "nou ");
		}
		
		
	}
}
