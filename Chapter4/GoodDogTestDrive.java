package Chapter4;

public class GoodDogTestDrive {

    public static void main (String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(11);

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();
        //声明装载7个Dog引用的Dog数组
        GoodDog[] pets;
        pets = new GoodDog[7];

        //创建两个Dog对象并赋值为数组的前两项元素
        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        //调用这两个Dog对象的方法
        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);
        System.out.println(x);


    }
}
