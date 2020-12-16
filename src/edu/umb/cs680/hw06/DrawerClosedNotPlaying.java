package edu.umb.cs680.hw06;


public class DrawerClosedNotPlaying implements State
{
	public DrawerClosedNotPlaying()	{}

	public void openCloseButtonPushed(DVDPlayer player) {
		player.open();
		player.changeState(new DrawerOpen());
	}

	public void playButtonPushed(DVDPlayer player) {
		player.play();
		player.changeState(new DrawerClosedPlaying());
	}

	public void stopButtonPushed(DVDPlayer player) {
		System.out.println("pushing the stop button had no effect because the DVD isn't playing");
	}
}

