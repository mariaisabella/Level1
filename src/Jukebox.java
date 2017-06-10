
// Copyright The League of Amazing Programmers, 2015
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JButton button3 = new JButton();
	//JButton button4

	Song current;
	public void createUI() {

		frame.add(panel);
		frame.setVisible(true);
		leftButton.setText("Hound Dog by Elvis Presley");
		rightButton.setText("Fly Me to the Moon by Frank Sinatra");
		leftButton.addMouseListener(this);
		rightButton.addMouseListener(this);
		panel.add(leftButton);
		panel.add(rightButton);
		frame.pack();
		frame.setTitle("Jukebox");
	}

	public static void main(String[] args) {
		// 3. Find an mp3 on your computer or on the Internet.
		// 4. Create a Song

		// 5. Play the Song

		/*
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
		Jukebox juke = new Jukebox();
		juke.createUI();
	}

	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouse clicked");
		JButton buttonClicked = (JButton) e.getSource();
		if (leftButton == buttonClicked) {
			if (current != null){
			current.stop();
			}
			Song Hounddog = new Song("Hound Dog.mp3");
			current = Hounddog;
			Hounddog.play();
		} else if (rightButton == buttonClicked){
			if (current != null){
				current.stop();
				}
			Song Flyme = new Song("Flyme.mp3");
			current = Flyme;
			Flyme.play();
		} else if (button3 == buttonClicked){
			if (current != null){
				current.stop();
				}
			Song WYLT = new Song("WYLT.mp3");
			current = WYLT;
			WYLT.play();
		}
	}

	private void playSound(String string) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}
