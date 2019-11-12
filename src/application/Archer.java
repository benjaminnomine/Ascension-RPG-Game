package application;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;

/**
 * This class is an extension of the GameCharacters class. It represents a
 * Archer game character.
 * 
 * @author Shari Sinclair
 *
 */
public class Archer extends GameCharacters {
    /**
     * The constructor sets the stats(attack, defense and stamina etc) of the Archer
     * object, and also sets the values needed to display the image instance
     * variable in the GUI.
     */
    public Archer() {
		// Stat values will be changed
		setAttack(150);
		setDefense(60);
		setStamina(400);
		setCurrentStamina(getStamina());
		setLevel(1);
		setX(190);
		setY(210);
		setWidth(230);
		setHeight(510);
		setCharacterImage(new Image("Archer.png", getWidth(), getHeight(), false, false));
		setType("Archer");
    }
}
