package LLD.SnachAndLadder;

import java.util.Random;

public class Dice {
	private int numberOfDice;
	private int maxNumber;

	public Dice(int numberOfDice, int maxNumber){
		this.numberOfDice = numberOfDice;
		this.maxNumber = maxNumber;
	}


	public int rollDice(){
		int totalNumber = 0;
		int count = 0;
		while(count < numberOfDice){
			int number = new Random().nextInt(maxNumber+1);
			totalNumber += number;
			count++;
		}
		return totalNumber;
	}
}
