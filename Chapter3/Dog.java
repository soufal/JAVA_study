//create a class named Dog
class Dog {
    //Dog hava a instance variable name
    String name;
    //Dog's method
    public static void main(String []args) {
	//create a Dog object
	Dog dog1 = new Dog();
	dog1.bark();
	dog1.name = "Bart";

	//create Dog array
	Dog[] myDogs = new Dog[3];

	myDogs[0] = new Dog();
	myDogs[1] = new Dog();
	myDogs[2] = dog1;

	//access Dog
	myDogs[0].name = "Fred";
	myDogs[1].name = "Marge";

	//myDogs[2]'s name is?
	System.out.println("last Dog's name is ");
	System.out.println(myDogs[2].name);

	//all dogs to bark()
	int x = 0;
	while(x < myDogs.length) {
	    myDogs[x].bark();
	    x = x + 1;
	}
    }

    //create the bark method of Dog
    public void bark() {
	 System.out.println(name + " says Ruff!");
    }

}
