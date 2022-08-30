
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		SwingUtilities.invokeLater(ui);
		try {
			Clip clip = AudioSystem.getClip();
			File ljudfil= new File("src/pop.wav");
			clip.open(AudioSystem.getAudioInputStream(ljudfil));
			clip.start(); 

		} catch (Exception exc) {
			System.out.println("The specified audio file is not supported.");

		}

	}

}
