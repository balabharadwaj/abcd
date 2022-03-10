package SnakeandLadder;
public class diceroll{
	private int noOfDice;
	diceroll(int noOfdice){
		this.noOfDice=noOfDice;
	}
	int rollDice() {
		int dice=((int)(math.random()*(6*(noOfDice)-1*(noOfDice))))+1;
		return dice;
	}
}