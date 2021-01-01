package edu.umb.cs680.hw06;

public class DVDPlayer
{	
	private State state;
	private DVDPlayer()	{
		this.state = DrawerClosedNotPlaying.getInstance();
	}
	private static DVDPlayer instance = null;

	public static DVDPlayer getInstance() {
		if (instance == null) {
    		instance = new DVDPlayer();
    		System.out.println("here's your DVD Player, currently its closed and not playing..");
    	} else {
    		System.out.println("sorry, you can't check out a second instance.");
    	}
		return instance;
	}

	public void changeState(State state) {	
		this.state = state;
	}
	public void openCloseButtonPushed() {
		System.out.println("the open/close button was pushed");
		state.openCloseButtonPushed(this);
	}
	public void playButtonPushed() {
		System.out.println("the play button was pushed");
		state.playButtonPushed(this);
	}
	public void stopButtonPushed() {
		System.out.println("the stop button was pushed");
		state.stopButtonPushed(this);
	}

	public void open() {
		System.out.println("the DVD drawer is opening...now it's open");
	}
	public void close() {
		System.out.println("the DVD drawer is closing...now it's closed");
	}
	public void play() {
		System.out.println("the DVD started playing");
	}
	public void stop() {
		System.out.println("the DVD stopped");
	}
}

