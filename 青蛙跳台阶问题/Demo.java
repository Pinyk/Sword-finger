package 剑指offer.青蛙跳台阶问题;

/**
 * @Author: gaoyk
 * @Date: 2021/6/10 23:39
 */
public class Demo {
    static int cable[] = new int[101];

    public static void main(String[] args) {
        int n = 7;
        System.out.println(numWays(n));
    }

    private static int numWays(int n) {
        if (n == 0 || n == 1){
            return 1;
        }else {
            if (cable[n] != 0){
                return cable[n];
            }else {
                cable[n] = (numWays(n - 1) + numWays(n - 2)) % 1000000007;
                return cable[n];
            }
        }
    }
}
