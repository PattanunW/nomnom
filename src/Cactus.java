import javafx.scene.image.Image;

public class Cactus extends Block{
	Image Cactus1 = new Image(ClassLoader.getSystemResource("Cactus1.png").toString());
	Image Cactus2 = new Image(ClassLoader.getSystemResource("Cactus2.png").toString());
	Image Cactus3 = new Image(ClassLoader.getSystemResource("Cactus3.png").toString());
	
	Cactus(int x, int y, int width, int height, Image img) {
		super(x, y, width, height, img);
		// TODO Auto-generated constructor stub
	}
}
