//create GuessGame class
public class GuessGame {
    //set three player instance variables
    Player p1;
    Player p2;
    Player p3;
	
    //create startGame method for the start of the game
    public void startGame() {
        //create three player objects
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();

	//declare three variable to hold the num what player guess
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;

	//declare three variable to hold a true or false based on player's answer
	boolean p1isRight = false;
	boolean p2isRight = false;
	boolean p3isRight = false;

	//make the "target" num that the player need to guess
	int targetNumber = (int) (Math.random() * 10);
	System.out.println("I'm thinking of a number between 0 and 9...");

	while(true) {
	    System.out.println("Number to guess is " + targetNumber);

	    //call the guess() method of the Player
	    p1.guess();
	    p2.guess();
	    p3.guess();
	    
	    //get the numbers of three Players and print out
	    guessp1 = p1.number;
	    System.out.println("Player one guessed " + guessp1);

	    guessp2 = p2.number;
	    System.out.println("Player two guessed " + guessp2);

	    guessp3 = p3.number;
	    System.out.println("Player three guessed " + guessp3);

	    //check each Player's answer to see if it matches the target
	    //if a Player is right, then set true
	    if (guessp1 == targetNumber) {
		p1isRight = true;
	    }
	    if (guessp2 == targetNumber) {
		p2isRight = true;	
	    }
	    if (guessp3 == targetNumber) {
		p3isRight = true;
	    }

	    if (p1isRight || p2isRight || p3isRight) {
		System.out.println("We have a winner!");
		System.out.println("Player one got it right? " + p1isRight);
		System.out.println("Player two got it right? " + p2isRight);
		System.out.println("Player three got it right? " + p3isRight);
		break;		//the game is over.Break out the loop/
	    } else {
		//no Player guess right,so the game need to continue
		System.out.println("Players will have to try again.");
	    }

	}
    }
}
