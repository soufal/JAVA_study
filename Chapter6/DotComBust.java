package Chapter6;

import Chapter5.GameHelper;

import java.util.ArrayList;

/**
 * @Classname DotComBust
 * @Date 2021/1/14 21:14
 * @Created by soufal
 * @Description 游戏的类。
 */
public class DotComBust {

    //声明并初始化变量
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuess = 0;
    
    private void setUpGame(){
        /*/**
         * @Description: 初始化DotCom对象并赋值
         * @Date: 2021/1/14 21:55
         * @param:[]
         * @return:void
         * @Author:soufal
         */
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("alibaba.com");
        DotCom three = new DotCom();
        three.setName("tencent.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        //输出提示简短的提示
        System.out.println("你的目标是击沉三个dot公司:");
        System.out.println("Pets.com，alibaba.com，tencent.com");
        System.out.println("尝试以最少的次数击沉他们。");

        //遍历dotcomlist中的每一个dotcom，给他们设置位置
        for (DotCom dotCom : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotCom.setLocationCells(newLocation);

        }
    }

    private void startPlaying() {
        /*/**
         * @Description: 游戏启动主要循环
         * @Date: 2021/1/14 22:17
         * @param:[]
         * @return:void
         * @Author:soufal
         */
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("输入你的猜测：");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        /*/**
         * @Description: 验证用户猜测
         * @Date: 2021/1/14 22:19
         * @param:[userGuess]
         * @return:void
         * @Author:soufal
         */
        numOfGuess++;
        String result = "miss";

        for(DotCom dotCom : dotComsList) {
            result = dotCom.checkYourself(userGuess);
            if (result.equals("hit")) {
                //击中则跳出循环，进行下一次猜测
                break;
            }
            if (result.equals("kill")) {
                //击沉则移除DotCom，并跳出循环
                dotComsList.remove(dotCom);
                break;
            }
        }
        System.out.println(result);

    }

    private void finishGame() {
        /*/**
         * @Description: 结束游戏并给出相应的结果输出
         * @Date: 2021/1/14 22:23
         * @param:[]
         * @return:void
         * @Author:soufal
         */
        System.out.println("恭喜你！所有的Dot公司都已经被击沉！");
        if (numOfGuess <=18) {
            System.out.println("你仅仅猜测了" + numOfGuess + "次！");

        } else {
            System.out.println("你猜测了" + numOfGuess + "次！结果不是很理想哦~");

        }
    }

    public static void main (String [] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }




}
