package com.github.perscholas.eroubele;

/**
 * Created by leon on 7/20/2020.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new CardGame();
        Player player = new DiceGamePlayer();
        game.add(player);
    }
}
