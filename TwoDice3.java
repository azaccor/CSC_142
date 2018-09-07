public class TwoDice3 {
	public static void main(String[] args) {
		double die1 = Math.random() * ((6-1) + 1) + 1;
		double die2 = Math.random() * ((6-1) + 1) + 1;
		int roll = (int) Math.floor((die1 + die2));
		System.out.print("The sum of the 2 dice is: " + roll);
	}
}
