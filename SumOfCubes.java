/* Sum of Cubes Problem */

public class SumOfCubes {
	public static void main(String[] args) {
		int i;
		int tthous, thous, huns, tens, ones;
		double cube;
		for(i = 100; i <= 99999; i++) {
			ones = (i % 10);
			tens = ((i - ones) % 100) /10;
			huns = ((i - (tens + ones)) % 1000) / 100;
			thous = ((i - (huns + tens + ones)) % 10000) / 1000;
			tthous = ((i - (thous + huns + tens + ones)) % 100000) / 10000;
			cube = Math.pow(ones, 3) + Math.pow(tens,  3) + Math.pow(huns, 3);
			if(i < 1000 && cube == i) {
				System.out.println(i + " = " + huns + "^3 + " + tens + "^3 + " + ones + "^3");
			} else if (i < 10000 && cube == i) {
				System.out.println(i + " = " + thous + "^3 + " + huns + "^3 + " + tens + "^3 + " + ones + "^3");
			} else if (cube == i){
				System.out.println(i + " = " + tthous + "^3 + " + thous + "^3 + " + huns + "^3 + " + tens + "^3 + " + ones + "^3");
			}
		}
	}
}
