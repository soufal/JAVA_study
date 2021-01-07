package Chapter5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Classname GameHelper
 * @Date 2021/1/7 23:32
 * @Created by soufal
 * @Description 用于获取用户输入类
 */
public class GameHelper {

    public String getUserInput(String prompt) {
        /*/**
         * @Description: 获取用户输入
         * @Date: 2021/1/7 23:35
         * @param:[prompt]输入前提示语
         * @return:void
         * @Author:soufal
         */
        String intpuLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            intpuLine = is.readLine();
            if (intpuLine.length() == 0) {
                return null;
            }
        }catch (IOException e){
            System.out.println(e);
        }
        return intpuLine;

    }
}
