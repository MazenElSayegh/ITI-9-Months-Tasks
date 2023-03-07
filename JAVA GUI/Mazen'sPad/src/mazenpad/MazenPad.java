/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazenpad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Mazen
 */
public class MazenPad extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        MazenPad1 mp= new MazenPad1();
        
        Scene scene = new Scene(mp);
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
