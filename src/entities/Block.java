package entities;
import interfaces.Drawable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Block implements Drawable{
	static int boardWidth = 1280;
	static int boardHeight = 768;
	
	int x;
	int y;
	int width;
	int height;
	Image img;

	Block(int x, int y, int width, int height, Image img) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.img = img;
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		
	}
}
