import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BotTest implements ActionListener {

	JButton ok = new JButton();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	


	private void createUI(){
		frame.add(panel);
		frame.setVisible(true);
		ok.setText("Ok");
		ok.addActionListener(this);
		frame.pack();
		frame.setTitle("Bot Test");
	}
	
	public void actionPerformed(ActionEvent event) {
		JButton buttonPressed = (JButton) event.getSource();
		
	}
}