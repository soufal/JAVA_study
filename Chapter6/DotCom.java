package Chapter6;

import java.util.ArrayList;

/**
 * @Classname DotCom
 * @Date 2021/1/11 21:58
 * @Created by soufal
 * @Description TODO
 */
public class DotCom {

    //Dot位置数组
    private ArrayList<String> locationCells;

    //记录hit次数,并初始化为0
//    int hitnums = 0;



    public void setLocationCells(ArrayList<String> locationList) {

        locationCells = locationList;

    }

    public String checkYourself(String userInput) {
        // 设置一个结果变量,默认为miss
        String result = "miss";

        // 判断玩家猜测值是否出现在locationList中，没有会返回-1
        int index = locationCells.indexOf(userInput);

        //判断用户是否hit
        if (index >= 0) {
            //移除源DotCom的相应的值
            locationCells.remove(index);
            //如果DotCom数组为空，则表示击沉了
            if (locationCells.isEmpty()) {
                //击沉
                result = "kill";

            } else {
                result = "hit";
            }
        }

        return result;

    }


}
