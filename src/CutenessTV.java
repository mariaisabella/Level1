import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton noodleButton = new JButton();
	JButton duckButton = new JButton();
	JButton frogButton = new JButton();

	public static void main(String[] args) {
		new CutenessTV().createUI();

	}

	public void createUI() {
		frame.add(panel);
		panel.add(duckButton);
		panel.add(frogButton);
		panel.add(noodleButton);
		frame.setVisible(true);
		
		

		frogButton.addActionListener(this);
		noodleButton.addActionListener(this);
		duckButton.addActionListener(this);

		frogButton.setText("Frogs");
		noodleButton.setText("Ducks");
		duckButton.setText("Food");

		frame.pack();
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFood() {
		playVideo("ZQYT2uuF57Q");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed= (JButton) e.getSource();
		if (frogButton==buttonPressed){
			 showFrog();
		} if (noodleButton==buttonPressed){
			showFood();
		} if (noodleButton==buttonPressed){
			showDucks();
		}
	}

}
