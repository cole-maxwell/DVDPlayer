package edu.umb.cs680.hw06;


public class DrawerClosedNotPlaying implements State
{
	private DrawerClosedNotPlaying()	{
		System.out.println("the DVD player is now closed and not playing");
	}

	public static DrawerClosedNotPlaying getInstance() {
		return new DrawerClosedNotPlaying();
	}


	public void openCloseButtonPushed(DVDPlayer player) {
		player.open();
		player.changeState(DrawerOpen.getInstance());
	}

	public void playButtonPushed(DVDPlayer player) {
		player.play();
		player.changeState(DrawerClosedPlaying.getInstance());
	}

	public void stopButtonPushed(DVDPlayer player) {
		System.out.println("pushing the stop button had no effect because the DVD isn't playing");
	}
}

