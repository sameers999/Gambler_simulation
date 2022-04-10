package com.bridgelabz;

import java.util.Scanner;

public class Gambler_SimulationUc7 {
	static int EVERY_DAY_STAKE = 100;
	static int BET_PER_GEME = 1;
	static int finalStakeAvailable = 0;
	static int monthlyDifference = 0;

	public static void main(String[] args) {
		
		int totalWon[] = new int[100];
		int totalLoss[] = new int[100];
		
		Scanner s = new Scanner(System.in);
		boolean label = true;
		while (label) {
			for (int i = 1; i <= 20; i++) {
				int cash = EVERY_DAY_STAKE;
				while (cash > 50 && cash < 150) {
					int gamePlay = (Math.random() <= 0.5) ? 1 : 2;
					switch(gamePlay) {
						case 1:
							cash = cash + BET_PER_GEME;
							break;
						case 2:
							cash = cash - BET_PER_GEME;
							break;
					}
				}
				if (cash == 150 || cash == 50) {
					System.out.println("Player Quits!");
				}
				if (cash > 100) {
					int wonInADay = cash - finalStakeAvailable;
					System.out.println("Player Won on "+i+" day is: $" + wonInADay);
				}
				if (cash < 100) {
					int lostInADay = cash - finalStakeAvailable;
					System.out.println("Player Lost on "+i+" day is: $" + lostInADay);
				}
				if(cash == 150) {
			 		totalWon[i] = cash; 
			 	}
			 	else if (cash == 50) {
			 		totalLoss[i] = cash;
				}
				finalStakeAvailable = finalStakeAvailable + cash;
			}
			 System.out.println("Luckiest days for gambler as he WON stake");
			 for(int i = 1; i <= 20; i++) {
				 if(totalWon[i] == 150)
				 System.out.println("In Day"+i+" won "+totalWon[i]+" $");
			 }
			 System.out.println("---------------------------------------------------------------------------");
			 System.out.println("Unluckiest days for gambler as he LOST maximum stake");
			 for(int i = 1; i <= 20; i++) {
				 if(totalLoss[i]== 50)
				 System.out.println("In Day"+i+" lost "+totalLoss[i]+" $");
		}
		System.out.println("EVERY_DAY_STAKE remaining with Gambler after 20 days is: "+finalStakeAvailable+" $");
		monthlyDifference = finalStakeAvailable - EVERY_DAY_STAKE * 20;
		
		if(monthlyDifference > 0) {
			System.out.println("Total gain of gambler is : "+monthlyDifference+"$");
		}
		else {
			System.out.println("Total Loss of gambler is : "+monthlyDifference+"$");
		}
		if(monthlyDifference > 0) {
			 System.out.println("Do you want to continue playing for next month? If yes, PRESS '1' else, PRESS '2'");
			 int gamePlay = s.nextInt();
			 if(gamePlay == 1) {
				 label = true;
			 }
			 else {
				 label = false;
				 System.out.println("End of the Game");
			 }
		}
		
		}
	}
}
