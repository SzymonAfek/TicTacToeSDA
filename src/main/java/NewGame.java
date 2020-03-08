public class NewGame {
    public static void main(String[] args) {

        char[][] board = {{'x', 'x', 'o'},
                          {'x', 'o', 'x'},
                          {' ', ' ', 'o'}};

        for (int lane = 0; lane < board.length; lane++) {
            for (int column = 0; column < board[lane].length; column++) {
                System.out.print(board[lane][column] + "\t");
            }
            System.out.println();
        }
    }
}
