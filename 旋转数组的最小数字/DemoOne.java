package 剑指offer.旋转数组的最小数字;

/**
 * @Author: gaoyk
 * @Date: 2021/6/15 23:14
 * 性质：做排序数组的任意元素必须大于右排序数组的任意元素
 */
public class DemoOne {
    public static void main(String[] args) {
        int numbers[] = {3, 4, 5, 1, 2};
        System.out.println(minArray(numbers));
    }

    private static int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (numbers[m] > numbers[j])
                i = m + 1;
            else if (numbers[m] < numbers[j])
                j = m;
            else
                j--;
        }
        return numbers[i];
    }


}
