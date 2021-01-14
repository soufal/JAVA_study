package Chapter5;

/**
 * @Classname SimpleDotCom
 * @Date 2021/1/6 23:50
 * @Created by soufal
 * @Description DotCom类
 */
public class SimpleDotCom {

    //Dot位置数组
    int[] locationCells;

    //记录hit次数,并初始化为0
    int hitnums = 0;



    public void setLocationCells(int[] locationList) {
        /*/**
         * @Description: 设置DotCom数组
         * @Date: 2021/1/7 21:54
         * @param:[]
         * @return:void
         * @Author:soufal
         */
        locationCells = locationList;

    }
    public String checkYourself(String userGuess) {
        /*/**
         * @Description: 检测用户猜测是否正确
         * @Date: 2021/1/7 21:57
         * @param:[userguess]
         * @return:java.lang.String
         * @Author:soufal
         */
        //将输入的字符串转换为int
        int intGuess = Integer.parseInt(userGuess);

        // 设置一个结果变量,默认为miss
        String result = "miss";

        //判断用户是否hit
        for(int cell: locationCells){
            if (intGuess == cell) {
                //击中,退出循环
                hitnums ++;
                result = "hit";
                break;
            }
        }
        //判断hit是否为3
        if (hitnums==3) {
            //击沉
            result = "kill";
        }

        //输出结果，并返回
        System.out.println(result);
        return result;

    }


}
