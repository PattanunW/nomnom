
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
		
		Canvas canvas = new Canvas(1280, 768);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		String image_path = "file:img/bg.jpg";
		setBackGround(gc, image_path);
		
		stage.show();
	}
	
	public void setBackGround(GraphicsContext gc, String image_path) {
		System.out.println(image_path);
		Image bg = new Image(image_path);
		
		gc.drawImage(bg, 0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
	}
	
	
	
	
//    public static void main(String[] args) throws Exception {
//        int boardWidth = 1280;
//        int boardHeight = 768;
//
//        JFrame frame = new JFrame("Chrome Dinosaur");
//        // frame.setVisible(true);
//        frame.setSize(boardWidth, boardHeight);
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
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