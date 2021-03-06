package Model.Actor;

import javafx.scene.image.Image;

/**
 * <pre>
 *     This class inherits the actor class
 *     Involves the digits that will be placed on the scoreboard
 * </pre>
 *
 */

public class Digit extends Actor{
    @Override
	public void act(long now) {
	}

	/**
	 * Grabs the digit you want and places it
	 * @param n The digit required
	 * @param dim height and width of digit
	 * @param x X coordinate where digit is placed
	 * @param y Y coordinate where digit is placed
	 */

	public Digit(int n, int dim, int x, int y) {
        Image im1 = new Image("file:src/main/resources/Images/" + n + ".png", dim, dim, true, true);
		setImage(im1);
		setX(x);
		setY(y);
	}

	
}
