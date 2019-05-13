package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import my_first_swing_gui.MyFirstSwingGUI;

public class soundMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	soundMachine(){
		frame.setVisible(true);
				JPanel panel = new JPanel();
		JButton button = new JButton();
		panel.add(button);
		button.addActionListener(this);
		button.setIcon(loadImage());
		frame.add(panel);
		frame.pack();
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
	public ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(new soundMachine().getClass().getResourceAsStream("cat.jpeg")));
		} catch (IOException e) {

			return null;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		playSound("meow.wav");
	}
}
