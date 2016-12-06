package com.sf.lottery.common.utils;

import org.springframework.stereotype.Component;

/**
 * Created by 01139954 on 2016/12/3.
 */
@Component
public class RandomUtil {
    /**
     * 随机指定范围内N个不重复的数
     * 最简单最基本的方法
     * @param min 指定范围最小值（包含）
     * @param max 指定范围最大值(不包含)
     * @param n 随机数个数
     */
    public static int[] getNRandom(int min, int max, int n){
        if (n > (max - min + 1) || max < min) {
            return null;
        }
        int[] result = new int[n];
        for(int i = 0 ; i < n ; i++){
            result[i] = -9999;
        }
        int count = 0;
        while(count < n) {
            int num = (int) ((Math.random() * (max - min)) + min);
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if(num == result[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result[count] = num;
                count++;
            }
        }
        return result;
    }

    public static void main(String args[]){
        for(int j = 0 ; j < 20 ; j++){
            int[] ran = getNRandom(0,10,5);
            for(int i = 0 ; i < ran.length ; i++){
                System.out.print(ran[i] + "," );
            }
            System.out.println("");
        }
    }
}