package edu.umb.cs680.hw06;


public class DrawerClosedNotPlaying implements State
{
	private static DrawerClosedNotPlaying player = new DrawerClosedNotPlaying();
	
	private DrawerClosedNotPlaying() {}
	
	public static DrawerClosedNotPlaying getInstance() {
		return player;
	}
	

	public void openCloseButtonPushed() {
		player.open();
		player.changeState(new DrawerOpen());
	}

	public void playButtonPushed() {
		player.play();
		player.changeState(new DrawerClosedPlaying());
	}

	public void stopButtonPushed() {}
}

