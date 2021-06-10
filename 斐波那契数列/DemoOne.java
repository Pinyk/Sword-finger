package 剑指offer.斐波那契数列;

/**
 * @Author: gaoyk
 * @Date: 2021/6/8 23:39
 * 由于 dp 列表第 i 项只与第 i-1 和第 i-2 项有关，
 * 因此只需要初始化三个整形变量 sum, a, b ，
 * 利用辅助变量 sum 使 a, b 两数字交替前进即可
 */
public class DemoOne {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
