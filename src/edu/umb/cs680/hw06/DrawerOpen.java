package edu.umb.cs680.hw06;


public class DrawerOpen implements State
{

	public DrawerOpen() {
		System.out.println("the DVD player is now open");
	}

	public static DrawerOpen getInstance() {
		return new DrawerOpen();
	}
	
	public void openCloseButtonPushed(DVDPlayer player) {
		player.close();
		player.changeState(DrawerClosedNotPlaying.getInstance());
	}

	public void playButtonPushed(DVDPlayer player) {
		player.close();
		player.play();
		player.changeState(DrawerClosedPlaying.getInstance());
	}

	public void stopButtonPushed(DVDPlayer player) {
		System.out.println("pushing the stop button had no effect because the drawer is open");
	}
}

