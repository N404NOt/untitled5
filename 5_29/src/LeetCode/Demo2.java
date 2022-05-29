package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-29
 * Time: 22:36
 */

class Solution {
    public void rotate(int[][] matrix) {
        int deep=matrix.length-1;
        int top=0;
        //行交换
        while(top<deep) {
            for (int i = 0; i < matrix[0].length; i++) {
                int temp=matrix[top][i];
                matrix[top][i]=matrix[deep][i];
                matrix[deep][i]=temp;
            }
            top++;
            deep--;
        }
        //对角线交换
       /* for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(j==0||i==j) {
                    continue;
                } else {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }

        }*/
        //对角线交换
        for (int i = 0; i <  matrix[0].length-1; i++) {
            for (int j = i+1; j < matrix[0].length; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {

    }
}
