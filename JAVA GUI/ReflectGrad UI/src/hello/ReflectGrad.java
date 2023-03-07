package hello;

//import java.awt.MultipleGradientPaint.CycleMethod;
//import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.Rectangle;
//import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
//import javafx.scene.paint.Paint;
import javafx.scene.paint.Stop;
//import JavaFX.scene.paint;
import javafx.scene.layout.VBox;
 
public class ReflectGrad extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Reflection reflection = new Reflection();
        reflection.setFraction(0.7);
       Text str= new Text ("Hello Word");
       str.setX(10.0);
       str.setY(50.0);
       str.setCache(true);
       str.setFill(Color.web("0x3b596d"));
       str.setFont(Font.font(null, FontWeight.BOLD,24));
       str.setFill(Color.RED);
       str.setEffect(reflection);
       StackPane root = new StackPane();
       root.getChildren().add(str);
       Scene scene =  new Scene(root, 300, 250);
       
       
       Stop[] stops = new Stop[] { new Stop(0, Color.BLACK), new Stop(0.5, Color.WHITE),new Stop(1, Color.BLACK)};
       LinearGradient ling;
       ling = new LinearGradient(0.0, 1.0, 0.0, 0.0, true, CycleMethod.NO_CYCLE, stops);            
       scene.setFill(ling);
       primaryStage.setTitle("Hello World!");
       primaryStage.setScene(scene);
       primaryStage.show();
     
       
      //scene.getStylesheets().add(getClass().getResource("/Css/Style.css").toString());
          //str.getStyleClass().add("styler");
       
       
    }
}