package edu.umb.cs680.hw06;


public class DrawerClosedPlaying implements State
{
	public DrawerClosedPlaying() {
		System.out.println("the DVD player is now closed and playing");
	}
	
	public void openCloseButtonPushed(DVDPlayer player) {
		player.stop();
		player.open();
		player.changeState(new DrawerOpen());
	}

	public void playButtonPushed(DVDPlayer player) {
		System.out.println("pushing the play button had no effect because the DVD is already playing");
	}

	public void stopButtonPushed(DVDPlayer player) {
		player.stop();
		player.changeState(new DrawerClosedNotPlaying());
	}
}

