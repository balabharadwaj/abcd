package SnakeandLadder;
import java.util.*;
public class play{
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		Queue<playerdetails> players=new LinkedList<>();
		System.out.println("Enter no of dice:");
		int dice_no=s.nextInt();
		diceroll dice=new diceroll(dice_no);
		System.out.println("Enter no of players:");
		int m=s.nextInt();
		s.nextLine();
		while(m-- >0) {
			System.out.println("Enter player name :");
			String name=s.nextLine();
			playerdetails p=new playerdetails(name);
			players.add(p);
		}
		ladder ld1=new ladder(3,27);
		ladder ld2=new ladder(9,50);
		ladder ld3=new ladder(18,45);
		ladder ld4=new ladder(41,81);
		ladder ld5=new ladder(54,93);
		Map<Integer,ladder> ld=new HashMap<>();
		ld.put(3,ld1);
		ld.put(9,ld2);
		ld.put(18,ld3);
		ld.put(41,ld4);
		ld.put(54,ld5);
		snake s1=new snake(99,72);
		snake s2=new snake(77,55);
		snake s3=new snakle(94,20);
		snake s4=new snake(52,25);
		snake s5=new snake(22,7);
		snake s6=new snake(33,8);
		Map<Integer,snake> s=new HashMap<>();
		GameBoard gb=new GameBoard(dice,players,ladder,snake);
		gb.startGame();
		s.close();
	}
}