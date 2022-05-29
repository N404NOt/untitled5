package LeetCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-05-29
 * Time: 18:22
 */
class Solution1 {
    public boolean isValidSudoku(char[][] board) {
        int[][] line=new int[board.length][board[0].length];
        int[][] col=new int[board.length][board[0].length];
        int[][] box=new int[board.length][board[0].length];
        int num=-1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length ; j++) {
                if(board[i][j]=='.') {
                    continue;
                }
                num=board[i][j]-'1';
                int box_Index=i/3*3+j/3;
                if(line[i][num]==1) {
                    return false;
                } if(col[j][num]==1) {
                    return false;
                } if(box[box_Index][num]==1) {
                    return false;
                }
                line[i][num]=1;
                col[j][num]=1;
                box[box_Index][num]=1;

            }

        }
        return true;

    }
}
public class Demo1 {
}
