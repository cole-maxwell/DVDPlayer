package edu.umb.cs680.hw06;

public class StartupDVD {
	public static void main(String[] args)
	{
		DVDPlayer player = DVDPlayer.getInstance();
		player.stopButtonPushed();
		player.openCloseButtonPushed();
		player.playButtonPushed();
	}
}
