package Chapter5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @Classname GameHelper
 * @Date 2021/1/7 23:32
 * @Created by soufal
 * @Description 用于获取用户输入类
 */
public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;

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

    public ArrayList<String> placeDotCom(int comSize) {
        /*/**
         * @Description: 给dotcom设置位置。
         * @Date: 2021/1/18 20:28
         * @param:[comSize] dotcom个数。
         * @return:java.util.ArrayList<java.lang.String>
         * @Author:soufal
         */
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String [comSize];
        String temp = null;
        int [] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLength;
        }

        while (!success & attempts++ < 200) {
            location = (int)(Math.random() * gridSize);
            int x = 0;
            success = true;
            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize) {
                        success = false;
                    }
                    if (x > 0 && (location % gridLength == 0)) {
                        success = false;
                    }
                } else {
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int column = 0;
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = (int)(coords[x] / gridLength);
            column = coords[x] % gridLength;
            temp =String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println(x + alphaCells.get(x-1));
        }
        return alphaCells;
    }
}
