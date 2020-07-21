package com.github.perscholas;

import com.github.perscholas.eroubele.Game;
import com.github.perscholas.eroubele.Player;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 7/20/2020.
 */
public class GameTest {

    @Test
    public void addTest() {
        // given
        Game game = new Game();
        Player player = new Player();

        // when
        game.add(player);

        // then
        Assert.assertTrue(game.contains(player));
    }
}
