package edu.umb.cs680.hw06;


public class DrawerOpen implements State
{
	
	private static DrawerOpen player = new DrawerOpen();
	private DrawerOpen() {}
	
	public static DrawerOpen getInstance() {
		return player;
	}
	
	public void openCloseButtonPushed() {
		player.close();
		player.changeState(new DrawerClosedNotPlaying());
	}

	public void close() {
		System.out.println("Drawer closed.");
	}
	
	public void play() {
		System.out.println("DVD playing.");
	}
	
	public void changeState(DrawerClosedNotPlaying player) {
		
	}

	public void playButtonPushed() {
		player.close();
		player.play();
		player.changeState(new DrawerClosedPlaying());

	}

	public void stopButtonPushed() {}
}

