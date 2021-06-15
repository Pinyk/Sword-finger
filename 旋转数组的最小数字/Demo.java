package 剑指offer.旋转数组的最小数字;

/**
 * @Author: gaoyk
 * @Date: 2021/6/15 23:03
 */
public class Demo {
    public static void main(String[] args) {
        int numbers[] = {3, 4, 5, 1, 2};
        System.out.println(minArray(numbers));
    }

    private static int minArray(int[] numbers) {
        if (numbers.length < 1){
            return 0;
        }
        int x = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i] > numbers[i+1]){
                x = numbers[i+1];
            }
        }
        return x;
    }
}
