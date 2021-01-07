package Chapter5;

/**
 * @Classname SimpleDotComTestDrive
 * @Date 2021/1/7 21:48
 * @Created by soufal
 * @Description SimpleDotCom测试类
 */
public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        //初始化一个SimpleDotCom对象
        SimpleDotCom dotCom = new SimpleDotCom();

        //赋值位置
        int[] locationList = {2,3,4};
        dotCom.setLocationCells(locationList);

        //传入假设猜想
        String userguess = "2";

        String result = dotCom.checkYourself(userguess);

        if (result.equals("hit")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }


    }
}
