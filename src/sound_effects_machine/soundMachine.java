
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
	JButton button2 = new JButton();
	JButton button = new JButton();
	soundMachine(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.add(button);
		button.addActionListener(this);
		button.setIcon(loadImage("cat.jpeg"));
		frame.add(panel);
		
	
		panel.add(button2);
		button2.addActionListener(this);
		button2.setIcon(loadImage("iAmSpeed.jpg"));

		frame.pack();
	}
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
	public ImageIcon loadImage(String file) {
		try {
			return new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream(file)));
		} catch (IOException e) {

			return null;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button){
		playSound("meow.wav");
		}
		if(e.getSource()== button2){
			playSound("horn.wav");
			}
	}
}
