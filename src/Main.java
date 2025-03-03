
import java.net.URL;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start(Stage stage) {
		StackPane root = new StackPane();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("DinoNaJu");
		stage.centerOnScreen();
		stage.setResizable(false);
		stage.setOnCloseRequest(event -> System.exit(0));


		
		Canvas canvas = new Canvas(1280, 768);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		setBackGround(gc);
		
		stage.show();
	}
	
	public void setBackGround(GraphicsContext gc) {
//		System.out.println(image_path);
		Image bg = new Image(ClassLoader.getSystemResource("bg.jpg").toString());
		gc.drawImage(bg, 0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
	}
	
	public void drawDinosour(GraphicsContext gc) {
		Dinosour dinosour = new Dinosour();
	}
	
	
	
//    public static void main(String[] args) throws Exception {
//        ChromeDinosaur chromeDinosaur = new ChromeDinosaur();
//        frame.add(chromeDinosaur);
//        frame.pack();
//        chromeDinosaur.requestFocus();
//        frame.setVisible(true);
//    }
    
    public static void main(String[] args) {
        launch(args);
    }
}