package edu.umb.cs680.hw06;


public class DrawerClosedPlaying implements State
{
	private DrawerClosedPlaying() {
		System.out.println("the DVD player is now closed and playing");
	}

	public static DrawerClosedPlaying getInstance() {
		return new DrawerClosedPlaying();
	}
	
	public void openCloseButtonPushed(DVDPlayer player) {
		player.stop();
		player.open();
		player.changeState(DrawerOpen.getInstance());
	}

	public void playButtonPushed(DVDPlayer player) {
		System.out.println("pushing the play button had no effect because the DVD is already playing");
	}

	public void stopButtonPushed(DVDPlayer player) {
		player.stop();
		player.changeState(DrawerClosedNotPlaying.getInstance());
	}
}

