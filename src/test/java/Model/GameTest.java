package Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    /**
     * Used to test if the pause setter and getter works
     */
    @Test
    public void pauseSetterGetterTest(){
        Game.setPauseGame(true);
        assertTrue(Game.getPauseGame());
    }

    @Test
    public void powerUpSetterGetterTest(){
        Game.setPowerUp(true);
        assertTrue(Game.isPowerUp());
    }


}