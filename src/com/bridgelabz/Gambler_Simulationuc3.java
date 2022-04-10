package com.bridgelabz;

import java.util.Scanner;

public class Gambler_Simulationuc3 {
	static int EVERY_DAY_STAKE = 100;
	static int BET_PER_GEME = 1;
	static int totalWon = 1;
	static int totalLoss = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cash = EVERY_DAY_STAKE;
		s.close();
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
			if (gamePlay == 1) {
				System.out.println("Gambler Won");
			}
			else {
				System.out.println("Gambler Lost");
			}
		}
		if (cash == 150 || cash == 50) {
			System.out.println("Player Quits!");
		}
	}
}

