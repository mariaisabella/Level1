import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageQuiz {
	
	public static void main(String[] args) throws Exception {
		Frame quizWindow=new Frame();
		quizWindow.setVisible(true);
		//create an image
		Component hero = createImage("http://vignette3.wikia.nocookie.net/theflash/images/6/6d/Flash1.jpg/revision/latest?cb=20081118005519");
		//add image to quizWindow;
		quizWindow.add(hero);
		
		
		String answer1 = JOptionPane.showInputDialog("Is this Wally West?");
		
		if answer1.equalsIgnoreCase("yes"){
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		//else if answer1.equalsIgnoreCase("no"){
	//		JOptionPane.showMessageDialog(null, "Wrong...");
	//	}
	//	else{
	//		JOptionPane.showMessageDialog(null, "wut");
		//}
		//call the pack method
		quizWindow.pack();
	
	}
	
private static Component createImage (String urlString) throws MalformedURLException{
	
	URL link = new URL(urlString);
	ImageIcon picture = new ImageIcon(link);
	JLabel lab = new JLabel(picture);
	return lab;

}
}

