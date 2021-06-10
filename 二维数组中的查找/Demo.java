package 剑指offer.二维数组中的查找;

/**
 * @Author: gaoyk
 * @Date: 2021/6/5 16:26
 * 自己
 */
public class Demo {
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
        if (matrix.length == 0){
            return false;
        }
        int r = matrix.length;
        int c = matrix[0].length;
        boolean flag = false;
        for (int i = 0; i < r; i++){
            for (int j =0; j < c; j++){
                if (matrix[i][j] == target){
                    flag = true;
                        return flag;
                }
                if (target < matrix[i][j]){
                    c = j;
                }
            }
        }
        return flag;
    }
}
