import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WW3 implements ActionListener {
	static JFrame france = new JFrame();
	static JPanel japan = new JPanel();
	static JButton britain = new JButton();

	public static void main(String[] args) {

		france.setVisible(true);
		japan.add(britain);

		france.add(japan);
		france.setTitle("WWIII");
		britain.setText("Start WWIII");
		france.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		if (buttonPressed = (britain) != null){
			System.out.println("what up dawg");
		}

	}
}
