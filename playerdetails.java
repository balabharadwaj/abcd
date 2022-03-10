package SnakeandLadder;
class playerdetails {
	private String playerName;
	private int location= 0;
	private(String playerName){
		this.playerName=playerName;
	}
	private String getPlayerName() {
		return playerName;
	}
	private int getLocation() {
		return location;
	}
	private int setLocation(int loc) {
		location=loc;
	}
}