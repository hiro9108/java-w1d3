/*
    (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock- paper game.
    (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
    The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
    The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws. Here are sample runs:
*/

import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Please wirte 0, 1, or 2 number. scissor(0), rock(1), paper(2): ");
            int enterNumber = input.nextInt();

            int randomNum = (int)(Math.random() * 3); 

        switch (enterNumber) {
            case 0:
                if (randomNum == 1) {
                    System.out.println("The computer is rock. You lose");
                    break;
                } else if (randomNum == 2) {
                    System.out.println("The computer is paper. You win");
                    break;
                } else {
                    System.out.println("The computer is scissor. You are scissor too. It is draw");
                    break;
                }
            case 1:
                if (randomNum == 0) {
                    System.out.println("The computer is scissor. You win");
                    break;
                } else if (randomNum == 2) {
                    System.out.println("The computer is paper. You lose");
                    break;
                } else {
                    System.out.println("The computer is rock. You are rock too. It is draw");
                    break;
                }
            case 2:
                if (randomNum == 0) {
                    System.out.println("The computer is scissor. You lose");
                    break;
                } else if (randomNum == 1) {
                    System.out.println("The computer is rock. You win");
                    break;
                } else {
                    System.out.println("The computer is paper. You are paper too. It is draw");
                    break;
                }
            default:
                System.out.println("Error");
        }

    }
}