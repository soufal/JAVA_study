public class ElectricGuitar {
    // 电吉他类

    //定义实例变量,并将其标记为私有的
    private String brand;
    private int numOfPickups;
    private boolean rockStarUseslt;

    public String getBrand() {
        //Accessor
        return brand;
    }

    public void setBrand(String brand) {
        //Mutator
        this.brand = brand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public boolean isRockStarUseslt() {
        return rockStarUseslt;
    }

    public void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public void setRockStarUseslt(boolean rockStarUseslt) {
        this.rockStarUseslt = rockStarUseslt;
    }
}
