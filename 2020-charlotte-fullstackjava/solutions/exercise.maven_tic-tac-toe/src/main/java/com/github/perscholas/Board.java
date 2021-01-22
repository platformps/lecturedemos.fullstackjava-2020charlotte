package com.github.perscholas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    private Boolean isInFavorOf(Character playerSymbol) {
        Predicate<Function<Integer, Character[]>> evaluate = (getColumnOrRowFunction) -> {
            for (int i = 0; i < 3; i++) {
                Character[] rowOrColumn = getColumnOrRowFunction.apply(i);
                int numberOfUniqueCharacters = new HashSet<>(Arrays.asList(rowOrColumn)).size();
                if (playerSymbol.equals(rowOrColumn[0]) && numberOfUniqueCharacters == 1) {
                    return true;
                }
            }
            return false;
        };
        Function<Integer, Character[]> getRow = (rowNumber) -> board[rowNumber];
        Function<Integer, Character[]> getColumn = (columnNumber) -> new Character[]{
                board[0][columnNumber],
                board[1][columnNumber],
                board[2][columnNumber]
        };
        Function<Integer, Character[]> getDiagnol1 = (ommittedValue) -> new Character[]{
                board[0][0],
                board[1][1],
                board[2][2]
        };
        Function<Integer, Character[]> getDiagnol2 = (ommittedValue) -> new Character[]{
                board[0][2],
                board[1][1],
                board[2][0]
        };
        return evaluate.test(getRow) ||
                evaluate.test(getColumn) ||
                evaluate.test(getDiagnol1) ||
                evaluate.test(getDiagnol2);
    }

    public Boolean isInFavorOfX() {
        return isInFavorOf('X');
    }

    public Boolean isInFavorOfO() {
        return isInFavorOf('O');
    }

    public Boolean isTie() {
        return (isInFavorOfX() && isInFavorOfO()) || (!isInFavorOfX() && !isInFavorOfO());
    }

    public String getWinner() {
        return isTie() ? "" : isInFavorOfX() ? "X" : "O";
    }

}
