package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class PhotoQuiz implements MouseMotionListener {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		int score = 0;
String pic ="https://cdn.vox-cdn.com/thumbor/-bKrYahnwqww9sH9v2h34v9ViA0=/0x114:585x559/1200x800/filters:focal(248x297:340x389)/cdn.vox-cdn.com/uploads/chorus_image/image/57272301/Screen_Shot_2017_10_23_at_10.16.32_AM.0.png";
		// 2. create a variable of type "Component" that will hold your image
Component a = createImage(pic);
a.addMouseMotionListener(this);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(a);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("Are apples berries");
if(question.equalsIgnoreCase("NO")){
	System.out.println("CORRECT");
	score += 1;
}
else{
	System.out.println("INCORRECT");
}
JOptionPane.showMessageDialog(null, "Your score is "+ score);
		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(a);
		// 10. find another image and create it (might take more than one line
		// of code)
String pict = "https://images-na.ssl-images-amazon.com/images/I/71gI-IUNUkL._SY355_.jpg";
		// 11. add the second image to the quiz window
Component image = createImage(pict);
		// 12. pack the quiz window
quizWindow.add(image);
quizWindow.pack();
		// 13. ask another question
String quest = JOptionPane.showInputDialog("Are bananas berries");
if(quest.equalsIgnoreCase("YeS")){
	System.out.println("CORRECT");
	score += 1;
}
else{
	System.out.println("INCORRECT");
}
JOptionPane.showMessageDialog(null, "Your score is "+ score);
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "STOP POKING ME!");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
