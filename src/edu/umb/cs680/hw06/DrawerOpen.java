package edu.umb.cs680.hw06;


public class DrawerOpen implements State
{
	public DrawerOpen() {
		System.out.println("the DVD player is now open");
	}
	
	public void openCloseButtonPushed(DVDPlayer player) {
		player.close();
		player.changeState(new DrawerClosedNotPlaying());
	}

	public void playButtonPushed(DVDPlayer player) {
		player.close();
		player.play();
		player.changeState(new DrawerClosedPlaying());
	}

	public void stopButtonPushed(DVDPlayer player) {
		System.out.println("pushing the stop button had no effect because the drawer is open");
	}
}

