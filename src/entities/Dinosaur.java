package entities;

import java.util.Timer;

import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Dinosaur extends Block {
	static Image dinosaurImg = new Image(ClassLoader.getSystemResource("dino-run.gif").toString());
	static Image dinosaurJumpImg = new Image(ClassLoader.getSystemResource("dino-jump.png").toString());
	static Image dinosaurDeadImg = new Image(ClassLoader.getSystemResource("dino-dead.png").toString());

	static int dinosaurWidth = 88;
	static int dinosaurHeight = 94;
	public static int dinosaurX = 100;
	public static int dinosaurY = boardHeight - dinosaurHeight;

	public Dinosaur() {
		super(dinosaurX, dinosaurY, dinosaurWidth, dinosaurHeight, dinosaurImg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(GraphicsContext gc) {
		// TODO Auto-generated method stub
		gc.drawImage(dinosaurImg, dinosaurX, dinosaurY);
	}

	
	
	public static Image[] gifFrames = loadGifFrames(ClassLoader.getSystemResource("dino-run.gif").toString());

    // ฟังก์ชันโหลดแต่ละเฟรมจาก GIF
    private static Image[] loadGifFrames(String gifPath) {
        return new Image[]{
            new Image("file:res/dino-run.gif"),
        };
    }
    
    
	
}
