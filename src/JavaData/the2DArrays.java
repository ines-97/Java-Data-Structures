package JavaData;

import java.util.Arrays;

public class the2DArrays {
    public static void main(String[] args) {

        String[][] board = new String[3][3];

        board[0][0] = "1";
        board[0][1] = "1";
        board[0][2] = "1";


//classic loop
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                System.out.println(board[i][j]);
        }

        System.out.println(Arrays.deepToString(board));
    }
}