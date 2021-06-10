package 剑指offer.二维数组中的查找;

/**
 * @Author: gaoyk
 * @Date: 2021/6/5 17:13
 * 可以将最左下角元素看为树的根节点
 * 比较根与target的大小，如果根大：向上一步 反之向右一步
 */
public class DemoAnswer {
    public static void main(String[] args) {
        int matrix [][] = {{1,4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 5;
        System.out.println(matrix.length);
        System.out.println(findNumberIn2DArray(matrix, target));
    }

    private static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target)
                i--;
            else if(matrix[i][j] < target)
                j++;
            else
                return true;
        }
        return false;
    }
}
