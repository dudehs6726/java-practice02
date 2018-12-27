package practice02;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		
		Scanner scanner = new Scanner( System.in );
		int money = 0;
		int val = 0;
		
		System.out.print("금액: ");
		money = scanner.nextInt();
		
		for(int i = 0; i < MONEYS.length; i++)
		{
			val = money / MONEYS[i];
			money %= MONEYS[i];
			
			System.out.println(MONEYS[i] +  "원 : " + val + "개");
		}
		
		scanner.close();
	}

}
