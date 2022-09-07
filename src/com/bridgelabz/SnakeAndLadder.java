/**
 * 
 */
package com.bridgelabz;

import java.util.Random;

/**
 * @author ASUS
 *
 */
public class SnakeAndLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startPosition = 0;
		int winPosition = 100;
		
		//System.out.println("Player position is: " + startPosition);
		Random random = new Random();
		int dice = 1 + random.nextInt(6);
		System.out.println("Dice Rolling...");
		System.out.println("Dice Number: " + dice);
		
		int playCheck = random.nextInt(3);
		//int playCheck =0;
		// To Check Options To No Play, Ladder Or Snake
		switch (playCheck) {
		case 0:
			System.out.println("No Play");
			break;
			
		case 1:
			System.out.println("Ladder");
			startPosition = startPosition + dice;
			if(startPosition > winPosition) {
				startPosition = startPosition - dice;
			}
				break;
			
		default:
			System.out.println("Snake");
			startPosition = startPosition - dice;
			if(startPosition <0) {
				startPosition = 0;
			}
			break;
		}
	System.out.println("The position is: " + startPosition);
	}

}
