public class BeerSong {
    
    public static void main(String []args) {
        int beernum = 99;
	String beerword = "bottles";

	while (beernum > 0) {
            
	    if (beernum ==1) {
		System.out.println(beernum + " bottle " + "of beer on the wall");
		System.out.println(beernum + " bottle " + "of beer.");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
		beernum = beernum - 1;
		System.out.println("No more bottles of beer on the wall.");

	    } else {
		System.out.println(beernum + " " + beerword + " of beer on the wall.");
		beernum = beernum - 1;
	    }



	}
    }

}
