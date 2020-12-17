package edu.umb.cs680.hw06;


public class DrawerClosedPlaying implements State
{
	private DrawerClosedPlaying() {}

	private static DrawerClosedPlaying instance = null;

	public static DrawerClosedPlaying getInstance() {
		if (instance == null) {
    		instance = new DrawerClosedPlaying();
    		System.out.println("the DVD player is now closed and playing");
    	} else {
    		System.out.println("sorry, you can only be one state at a time.");
    	}
		return instance;
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

