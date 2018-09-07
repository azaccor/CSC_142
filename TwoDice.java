import java.util.*;
public class TwoDice {
	public static void main(String[] args) {
		Random rand = new Random();
		int die1 = rand.nextInt(5)+1;
		int die2 = rand.nextInt(5)+1;
		int roll = die1+die2;
		System.out.print("The sum of the 2 dice is: " + roll);
	}

}
