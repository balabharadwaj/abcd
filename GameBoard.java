package SnakeandLadder;
import java.util.*;
class GameBoard{
	private diceroll dice;
	private Queue<playerdetails> nextTurn;
	private Map<Integer,ladder>ladder;
	private Map<Integer,snake>snake;
	private List<String> wo=new ArrayList<>();
	int bs=100;
	GameBoard(diceroll dice,Queue<playerdetails> nextTurn(),Map<Integer,ladder> ladder,Map<Integer,snake> snake){
		this.dice=dice;
		this.nextTurn=nextTurn;
		this.ladder=ladder;
		this.snake=snake;
	}
	void startGame() {
		while(nextTurn.size()>1) {
			playerdetails p=nextTurn.poll();
			int cp=p.getLocation();
			int dv=dice.rollDice();
			System.out.println(p.getPlayerName()+"rolled"+ dv);
			if nc=cp+dv;
			if(nc<=bs) {
				if(nc==bs) {
					wo.add(p.getPlayerName());
					System.out.println(p.getPlayerName()+"won the game");
				}
				else {
					if(snake.containsKey(nc)) {
						System.out.println(p.getPlayerName()+"bitten by snake");
						nc=snake.get(nc).getendPoint();
					}
					if(ladder.containsKey(nc)) {
						System.out.println(p.getPlayername()+"moving on the ladder");
						nc=ladder.get(nc).getendPoint();
					}
					nextTurn.add(p);
					p.setLocation(nc);
				}
			}
			else {
				nextTurn.add(p);
			}
			System.out.println(p.getPlayerName()+"at position"+p.getLocation());
		}
		System.out.println("winning order is:"+ wo);
	}
}