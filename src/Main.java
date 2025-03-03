import entities.Dinosour;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Image bg; 

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
        GraphicsContext dinosaurGc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);


        setBackGround(gc);

        Dinosour dinosaur = new Dinosour();
        dinosaur.draw(dinosaurGc);

        stage.show();


        AnimationTimer animationTimer = new AnimationTimer() {
            private int currentFrame = 0;

            @Override
            public void handle(long now) {
                // ล้างเฉพาะพื้นที่ที่จำเป็น
                dinosaurGc.clearRect(dinosaur.dinosaurX, dinosaur.dinosaurY, dinosaur.gifFrames[currentFrame].getWidth(), dinosaur.gifFrames[currentFrame].getHeight());

                // วาดพื้นหลังซ้ำ
                gc.drawImage(bg, 0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());

                // วาดตัวละคร
                dinosaurGc.drawImage(dinosaur.gifFrames[currentFrame], dinosaur.dinosaurX, dinosaur.dinosaurY);

                // อัปเดตเฟรมถัดไป
                currentFrame = (currentFrame + 1) % dinosaur.gifFrames.length;
            }
        };

        // start
        animationTimer.start();
    }

    // 
    public void setBackGround(GraphicsContext gc) {
        bg = new Image(ClassLoader.getSystemResource("bg.jpg").toString()); 
        gc.drawImage(bg, 0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight()); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}
