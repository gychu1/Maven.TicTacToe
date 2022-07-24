package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        for (int i = 0; i < 3; i++) {
            if (this.matrix[i][0] == 'X' && this.matrix[i][0] == this.matrix[i][1] && this.matrix[i][1] == this.matrix[i][2]) {
                return (this.matrix[i][0] == 'X');
            }
            if (this.matrix[0][i] == 'X' && this.matrix[0][i] == this.matrix[1][i] && this.matrix[1][i] == this.matrix[2][i]) {
                return (matrix[0][i] == 'X');
            }
        }
        if (this.matrix[0][0] == 'X' && this.matrix[0][0] == this.matrix [1][1] && this.matrix[1][1] == this.matrix[2][2]){
            return true;
        }
        return this.matrix[0][2] == 'X' && this.matrix[0][2] == this.matrix[1][1] && this.matrix[1][1] == this.matrix[2][0];
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < 3; i++) {
            if (this.matrix[i][0] == 'O' && this.matrix[i][0] == this.matrix[i][1] && this.matrix[i][1] == this.matrix[i][2]) {
                return (this.matrix[i][0] == 'O');
            }
            if (this.matrix[0][i] == 'O' && this.matrix[0][i] == this.matrix[1][i] && this.matrix[1][i] == this.matrix[2][i]) {
                return (matrix[0][i] == 'O');
            }
        }
        if (this.matrix[0][0] == 'O' && this.matrix[0][0] == this.matrix [1][1] && this.matrix[1][1] == this.matrix[2][2]){
            return true;
        }
        return this.matrix[0][2] == 'O' && this.matrix[0][2] == this.matrix[1][1] && this.matrix[1][1] == this.matrix[2][0];
    }

    public Boolean isTie() {
        return !isInFavorOfX() && !isInFavorOfO();
    }

    public String getWinner() {
        if (isInFavorOfO()){
            return "O";
        }
        if (isInFavorOfX()){
            return "X";
        }
        else
            return "";
    }
}
