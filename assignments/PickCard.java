/*
    (Game: pick a card) Write a program that simulates picking a card from a deck of 52 cards.
    Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
    Here is a sample run of the program:
    Hint: This is a good use for a switch case

*/

public class PickCard {
    public static void main(String[] args) {

        String type;

        int rank = (int)(Math.random() * 13) + 1; 

        int suit = (int)(Math.random() * 4) + 1; 

        if (suit == 1) {
            type = "Clubs";
        } else if (suit == 2) {
            type = "Diamonds";
        } else if (suit == 3) {
            type = "Hearts";
        } else {
            type = "Spades";
        }

        switch (rank) {
            case 1:
                System.out.println("This card you picked is Ace of " + type);
                break;
            case 2:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 3:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 4:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 5:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 6:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 7:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 8:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 9:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 10:
                System.out.println("This card you picked is " + rank + " of " + type);
                break;
            case 11:
                System.out.println("This card you picked is Jack of " + type);
                break;
            case 12:
                System.out.println("This card you picked is Queen of " + type);
                break;
            case 13:
                System.out.println("This card you picked is King of" + type);
                break;
            default:
                System.out.println("Error");
        }

    }
}