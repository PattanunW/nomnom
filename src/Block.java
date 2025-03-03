import javafx.scene.image.Image;

public class Block {
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
}
