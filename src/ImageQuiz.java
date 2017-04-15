import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageQuiz {

	public static void main(String[] args) throws Exception {
		
		int score = 0;
		
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		// create an image
		Component hero = createImage(
				"http://vignette3.wikia.nocookie.net/theflash/images/6/6d/Flash1.jpg/revision/latest?cb=20081118005519");
		// add image to quizWindow;
		quizWindow.add(hero);
		quizWindow.pack();
		String answer1 = JOptionPane.showInputDialog("Is this Wally West?");

		if (answer1.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score+1;

		} else if (answer1.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Wrong...");
		} else {
			JOptionPane.showMessageDialog(null, "wut");
		}

		

		Frame quizWindow2 = new Frame();
		quizWindow2.setVisible(true);
		// create an image
		Component hero2 = createImage(
				"https://static2.comicvine.com/uploads/scale_small/3/31666/4452262-blackcanary_1_54fde7014609b8.59192533.jpg");
		// add image to quizWindow;
		quizWindow2.add(hero2);
		quizWindow2.pack();
		String answer2 = JOptionPane.showInputDialog("Is this Flyng Raven?");

		if (answer2.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Wrong...");
		} else if (answer2.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score+1;
		} else {
			JOptionPane.showMessageDialog(null, "wut");
		}

		
		Frame quizWindow3 = new Frame();
		quizWindow3.setVisible(true);
		// create an image
		Component hero3 = createImage(
				"https://static2.comicvine.com/uploads/scale_small/6/66303/2760649-screen_shot_2012_12_19_at_7.20.46_am.png");
		// add image to quizWindow;
		quizWindow3.add(hero3);
		quizWindow3.pack();
		String answer3 = JOptionPane.showInputDialog("Is this Troy Broken?");

		if (answer3.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Wrong...");
		} else if (answer3.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score+1;
		} else {
			JOptionPane.showMessageDialog(null, "wut");
		}

		float percent = ((float)score/3)*100;
		
		JOptionPane.showMessageDialog(null, "Your score is "+score+"/3! Your percentage is "+percent+"%.");

	}

	private static Component createImage(String urlString) throws MalformedURLException {

		URL link = new URL(urlString);
		ImageIcon picture = new ImageIcon(link);
		JLabel lab = new JLabel(picture);
		return lab;

	}
}
