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
		System.out.println("Player position is: " + startPosition);
		Random random = new Random();
		int dice = 1 + random.nextInt(6);
		System.out.println("Dice Rolling...");
		System.out.println("Dice Number: " + dice);
	}

}
