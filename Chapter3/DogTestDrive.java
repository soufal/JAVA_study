public class DogTestDrive {

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

        // dog的size
        myDogs[0].size = 61;
        myDogs[1].size = 15;
        myDogs[2].size = 8;
        //myDogs[2]'s name is?
        System.out.println("last Dog's name is ");
        System.out.println(myDogs[2].name);

        //all dogs to bark()
        int x = 0;
        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }

        //给theSecret方法传参，并输出
        System.out.println(myDogs[0].theSecret(5));
    }

}
