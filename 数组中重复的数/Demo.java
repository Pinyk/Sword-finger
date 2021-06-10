package 剑指offer.数组中重复的数;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: gaoyk
 * @Date: 2021/6/5 16:08
 */
public class Demo {
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,5,6};
        System.out.println(findRepeatNumber(arr));
    }

    private static int findRepeatNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int x : arr){
            if (!set.add(x)){
                return x;
            }
        }
        return 0;
    }
}
