package Homework5;
/*
 * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
0x000000
0000x000
00x00000
 */
public class Task3 {
    public static void main(String[] args) {
        int bS = 8;
        String[][] board = new String[bS][bS];
        for (int i = 0; i < bS; i++) {
            for (int j = 0; j < bS; j++) {
                board[i][j] = "0";
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        board[0][3] = "x";
        board[1][1] = "x";
        board[2][7] = "x";
        board[3][4] = "x";
        board[4][6] = "x";
        board[5][0] = "x";
        board[6][2] = "x";
        board[7][5] = "x";
        for (int i = 0; i < bS; i++) {
            for (int j = 0; j < bS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
    }
    }
}
