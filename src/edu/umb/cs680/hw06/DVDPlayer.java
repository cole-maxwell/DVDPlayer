package edu.umb.cs680.hw06;

public class DVDPlayer
{	
	private State state;
	private DVDPlayer()	{
		System.out.println("here's your DVD Player, currently its closed and not playing..");
		this.state = DrawerClosedNotPlaying.getInstance();
	}
	public static DVDPlayer getInstance() {
		return new DVDPlayer();
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

	protected void open() {
		System.out.println("the DVD drawer is opening...now it's open");
	}
	protected void close() {
		System.out.println("the DVD drawer is closing...now it's closed");
	}
	protected void play() {
		System.out.println("the DVD started playing");
	}
	protected void stop() {
		System.out.println("the DVD stopped");
	}
}

