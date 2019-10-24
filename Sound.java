import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
 class Sound {
private File file; //to assign path for AudioInputStream
private AudioInputStream ais; //AudioInputStream to process file
private Clip clip; //clip to store file
	/*********************************************************888
	 * Most methods here are the same. Theres a private method that
	 * deals with the creation of the clip, and then theres a
	 * method that calls the private method to create the clip
	 * and then plays the clip once its returned back to them.
	 *  Theres a stopMusic() method that is unique to the clip
	 *  that plays the funkypianomusic, being that it is played
	 *  on loop instead of just once at a time.
	 ******************************************************/
	private Clip makeWreeeSound(){
		this.file = new File("src/sounds/wreee.wav");
		try {
			this.ais = AudioSystem.getAudioInputStream(file);
			this.clip = AudioSystem.getClip();
			this.clip.open(ais);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clip;
	}//end of makeWreeSound

	void playWreeeSound() {
		this.clip = makeWreeeSound();
		this.clip.start();
		clip.setFramePosition(0);
		System.out.println("Debug : Wreee played");

	}

	private Clip makeMusic(){
		file = new File("src/sounds/funkypianoloop.wav");
		try {
			this.ais = AudioSystem.getAudioInputStream(file);
			this.clip = AudioSystem.getClip();
			this.clip.open(ais);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clip;
	}//end of makeWreeSound

	void playMusic() {
		this.clip = makeMusic();
		this.clip.loop(Clip.LOOP_CONTINUOUSLY);
		this.clip.setFramePosition(0);
		System.out.println("Debug : music started and is being looped");


	}
	void stopMusic() { //stops music so it doesnt play at the game over screen
		this.clip.stop();
		System.out.println("Debug : music stopped ");
	}

	private Clip makeSnortSound(){
		this.file = new File("src/sounds/pigsnort.wav");
		try {
			this.ais = AudioSystem.getAudioInputStream(file);
			this.clip = AudioSystem.getClip();
			this.clip.open(ais);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clip;
	}//end of makeSnortSound

	void playSnortSound() {
		this.clip = makeSnortSound();
		this.clip.start();
		clip.setFramePosition(0);
		System.out.println("Debug : Wreee played");

	}
	private Clip makeHornSound(){
		this.file = new File("src/sounds/jeephorn2.wav");
		try {
			this.ais = AudioSystem.getAudioInputStream(file);
			this.clip = AudioSystem.getClip();
			this.clip.open(ais);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return clip;
	}//end of makeSnortSound

	void playHornSound() {
		this.clip = makeHornSound();
		this.clip.start();
		clip.setFramePosition(0);
		System.out.println("Debug : horn sound played");

	}


 }//end of Sound class
