package brayden.pokemon;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class HealthBar {
	
	//globals
	private Sprite sprite;
	private int height;

	/**
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public HealthBar(int x, int y, int width, int height) {
		this.height = height;
		sprite = new Sprite(new Texture("Battle/HealthBar.png"));
		sprite.setSize(width, height);
		sprite.setPosition(x, y);
	}

	/**
	 * @param batch
	 */
	public void draw(Batch batch) {
		sprite.draw(batch);
	}

	/**
	 * @param healthbarWidth
	 */
	public void setWidth(int healthbarWidth) {
		sprite.setSize(healthbarWidth, height);
	}
}
