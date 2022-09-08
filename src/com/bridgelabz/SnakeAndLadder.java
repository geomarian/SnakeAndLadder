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
		int diceRolled = 0;
		int numberOfPlayer = 2;
		Scanner input = new Scanner(System.in);
		System.out.println("Number Of Player: " + numberOfPlayer);

		Random rand = new Random();
		int dice = 1 + rand.nextInt(6);

		//startGame Player 1 
		for(int startPositionP1 = 0; startPositionP1 != winPosition;) {


			//startGame Player 2 
			for(int startPositionP2 = 0; startPositionP2 != winPosition;) {
				System.out.println("Press 2 to roll dice: ");

				int num2 = input.nextInt();

				if(num2==2) {

					Random random = new Random();
					//		int dice = 1 + random.nextInt(6);
					System.out.println("-----------------");
					System.out.println("Dice rolled and number is : " + dice);
					int playCheck = random.nextInt(3);
					String str1 = "Ladder";
					if(playCheck==0) {

						System.out.println("No Play");
					}
					//					 if(playCheck==1) {
					//						 if(str1!=null) {
					//								System.out.println("Got Ladder - Player 1 will play again!");
					//						 	
					//					}

					while(str1 != "Ladder") {
						System.out.println("Got Ladder - Player 1 will play again!");
						str1 = input.nextLine();

					}
					System.out.println("Ladder - Player stepped Up");
					startPositionP2 = startPositionP2 + dice;
				}


				else{
					System.out.println("Snake - Player stepped Down");
					startPositionP2 = startPositionP2 - dice;
					startPositionP2 = 0;
				}
				System.out.println("The position is: " + startPositionP2);
				System.out.println("-----------------");
			}

			//for Player 1

			System.out.println("Press 1 to roll dice: ");

			int num = input.nextInt();

			if(num==1) {

				Random random = new Random();
				//int dice = 1 + random.nextInt(6);
				System.out.println("-----------------");
				System.out.println("Dice rolled and number is : " + dice);


				int playCheck = random.nextInt(3);


				switch (playCheck) {
				case 0:
					System.out.println("No Play");
					break;

				case 1:
					String str = "Ladder";
					System.out.println("Ladder - Player stepped Up");
					startPositionP1 = startPositionP1 + dice;
					if(startPositionP1 > winPosition) {
						startPositionP1 = startPositionP1 - dice;
					} else if(str!=null) {
						System.out.println("Got Ladder - Player 1 will play again!");
					}
					break;

				default:
					System.out.println("Snake - Player stepped Down");
					startPositionP1 = startPositionP1 - dice;
					startPositionP1 = 0;
					break;
				}
				System.out.println("The position is: " + startPositionP1);
				System.out.println("-----------------");

			}	
		}
		System.out.println("You Rolled Dices " + diceRolled + " Times.");
		System.out.println("Congratulations! You Won The Game.");
	}
}

