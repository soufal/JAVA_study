package Chapter5;

/**
 * @Classname SimpleDotComGame
 * @Date 2021/1/6 23:51
 * @Created by soufal
 * @Description Game主函数
 */
public class SimpleDotComGame {

    public static void main (String[] args) {
        //声明一个变量用于存储用户猜测次数
        int numsOfGuess = 0;


        //声明一个SimpleDotCom对象
        SimpleDotCom dotCom = new SimpleDotCom();

        //声明一个gamehelper对象，用于获取用户的输入
        GameHelper helper = new GameHelper();

        //生成一个随机数从0到4作为DotCom的start
        int startCell = (int) (Math.random()*4);

        //基于start生成Location数组,并set
        int[] LocCellList = {startCell, startCell+1, startCell+2};
        dotCom.setLocationCells(LocCellList);

        //声明一个boolean变量用于判断DotCom是否存活
        boolean isAlive = true;

        // Game begin
        while (isAlive) {
            //获取用户输入
//            Scanner ip = new Scanner(System.in);
//            System.out.print("Enter a number: ");
//            String userGuess = ip.nextLine();
//            ip.close();

            String userGuess = helper.getUserInput("Enter a number: ");

            //检查用户猜测
            String guessResult = dotCom.checkYourself(userGuess);
            numsOfGuess++;
            if (guessResult=="kill") {
                //如果DotCom已经被击沉，则退出循环，并输出猜测次数
                isAlive = false;
                System.out.println("You toke " + numsOfGuess + " guesses!");
                    }
                }

            }



        }






