/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LifeCycleTest extends Application {
    
    
    public static void main(String[] args) {
        launch (args);
    }
     public LifeCycleTest(){
        String name =Thread.currentThread().getName();
        System.out.println("Constructor() method: current Thread: "+ name);
        
    }
    @Override
    public void init() throws Exception {
        String name= Thread.currentThread().getName();
        System.out.println("init() method: current Thread:" + name);
        super.init();
    }
   
    @Override
    public void start(Stage primaryStage) {
        String name=Thread.currentThread().getName();
        System.out.println("start() method: current Thread"+ name);
        
        StackPane root=new StackPane();
        Text str= new Text("Hello Life Cycle");
        root.getChildren().add(str);
        Scene scene= new Scene(root,300,250);
        scene.getStylesheets().add(getClass().getResource("/CSS/lifeCycle.css").toString());
        str.getStyleClass().add("styler");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @Override
    public void stop() throws Exception{
        String name=Thread.currentThread().getName();
        System.out.println("Stop() method: current Thread:"+ name);
        super.stop();
    }
    
}
