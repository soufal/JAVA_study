//create the Player class
public class Player {
    //set the number of guess
    int number = 0;

    //set the guess method
    public void guess() {
	number = (int)(Math.random() * 10);
	System.out.println("I'm guessing " + number);
    }
}
