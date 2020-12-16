package edu.umb.cs680.hw06;


public class DrawerClosedPlaying implements State
{
	
	private static DrawerClosedPlaying player = new DrawerClosedPlaying();
	private DrawerClosedPlaying() {}
	
	public static DrawerClosedPlaying getInstance() {
		return player;
	}

	public void openCloseButtonPushed() {
		player.stop();
		player.open();
		player.changeState(new DrawerOpen());
	}

	public void playButtonPushed() {}

	public void stopButtonPushed() {
		player.stop();
		player.changeState(new DrawerClosedNotPlaying());
	}
}

