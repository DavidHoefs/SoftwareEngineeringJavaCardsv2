/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3365_project1;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.Parent;

public class CS3365_Project1 extends Application {
   

    
    
    @Override
    public void start(Stage stage) throws Exception{
    
         Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
       
      }

    
    public static void main(String[] args) {
        launch(args);

    }
}
