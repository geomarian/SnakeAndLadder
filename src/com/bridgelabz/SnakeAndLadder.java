/**
 * 
 */
package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;


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

		int winPosition = 100;
		
		Scanner input = new Scanner(System.in);
	
		for(int startPositionP1 = 0; startPositionP1 != winPosition;) {
			//startGame
			System.out.println("Press 1 to roll dice: ");

			int num = input.nextInt();

			if(num==1) {

				Random random = new Random();
				int dice = 1 + random.nextInt(6);
				System.out.println("-----------------");
				System.out.println("Dice rolled and number is : " + dice);

				
				int playCheck = random.nextInt(3);

		
				switch (playCheck) {
				case 0:
					System.out.println("No Play");
					break;

				case 1:
					System.out.println("Ladder");
					startPositionP1 = startPositionP1 + dice;
					if(startPositionP1 > winPosition) {
						startPositionP1 = startPositionP1 - dice;
					}
					break;

				default:
					System.out.println("Snake");
					startPositionP1 = startPositionP1 - dice;
					startPositionP1 = 0;
					break;
				}
				System.out.println("The position is: " + startPositionP1);
				System.out.println("-----------------");
				 
			}	
		}
		System.out.println("Incorrect Digit! Please enter new number.");
	}}
