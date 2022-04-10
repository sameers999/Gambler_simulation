package com.bridgelabz;

public class Gambler_simulationUc2 {
	public static void main(String[] args) {
		int EVERY_DAY_STAKE = 100;
		int BET_PER_GEME = 1;
		
		if (Math.random() < 0.5){
			EVERY_DAY_STAKE++;
		System.out.println("Gambler Won and his total Stake will be: " + EVERY_DAY_STAKE);
		}
		else {
			EVERY_DAY_STAKE--;
		System.out.println("Gambler Lost and his total Stake will be: " +EVERY_DAY_STAKE);
		}
	}
}

