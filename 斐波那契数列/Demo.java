package 剑指offer.斐波那契数列;

/**
 * @Author: gaoyk
 * @Date: 2021/6/7 18:40
 * 直接使用递归会导致时间过长，因为中间会产生重复计算
 * 所以引入一个cache数组 使用缓存进行记录已经计算过的值
 */
public class Demo {

    static int cache[] = new int[101];

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n == 0 || n == 1){
            return n;
        }else{
            if (cache[n] != 0){
                return cache[n];
            }
            cache[n] = (fib(n -1) + fib(n - 2)) % 1000000007;
            return cache[n];
        }
    }
}
