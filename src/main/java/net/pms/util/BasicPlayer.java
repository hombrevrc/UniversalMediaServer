package net.pms.util;

import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;

public interface BasicPlayer extends ActionListener {
	public class State {
		public int playback;
		public boolean mute;
		public int volume;
		public String position, duration;
		public String uri, metadata;
	}

	final static int STOPPED = 0;
	final static int PLAYING = 1;
	final static int PAUSED = 2;
	final static int PLAYCONTROL = 1;
	final static int VOLUMECONTROL = 2;

	public void setURI(String uri, String metadata);

	public void pressPlay(String uri, String metadata);

	public void play();

	public void pause();

	public void stop();

	public void next();

	public void prev();

	public void forward();

	public void rewind();

	public void mute();

	public void setVolume(int volume);

	public void add(int index, String uri, String name, String metadata, boolean select);

	public void remove(String uri);

	public State getState();

	public int getControls();

	public DefaultComboBoxModel getPlaylist();

	public void connect(ActionListener listener);

	public void disconnect(ActionListener listener);

	public void refresh();

	public void close();
}