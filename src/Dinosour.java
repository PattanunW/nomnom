import javafx.scene.image.Image;

public class Dinosour extends Block{
	static Image dinosaurImg = new Image(ClassLoader.getSystemResource("dino-run.gif").toString());
	Image dinosaurJumpImg = new Image(ClassLoader.getSystemResource("dino-dead.png").toString());
 	Image dinosaurDeadImg = new Image(ClassLoader.getSystemResource("dino-jump.png").toString());
 	
 	static int dinosaurWidth = 88;
	static int dinosaurHeight = 94;
	static int dinosaurX = 100;
	static int dinosaurY = boardHeight - dinosaurHeight;
 	
 	Dinosour() {
		super(dinosaurX, dinosaurY, dinosaurWidth, dinosaurHeight, dinosaurImg);
		// TODO Auto-generated constructor stub
	}
	
}
