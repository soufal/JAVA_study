package Chapter4;

public class GoodDog {
    //封装的Gog类
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void bark() {
        if (size > 61) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println(("Ruff! Ruff!"));
        } else {
            System.out.println("Yip! Yip!");
        }

    }

}
