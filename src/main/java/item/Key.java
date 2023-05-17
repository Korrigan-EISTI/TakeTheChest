package main.java.item;

import javafx.scene.image.Image;
import main.java.Environment;

public class Key extends Item{
	
	public static Image img = new Image("file:src/main/resources/items/key.png");
	
	public Key(double x, double y) {
		super (x, y, 1, 1);
	}
	
	@Override
	public void tick (Environment e) {
		super.tick(e);
		if (!status) {
			e.getPlayer().setHasKey(true);
			e.setGameProgression(3);
		}
	}
	
	@Override
	public Image getImage() {
		return img;
	}
	
}
