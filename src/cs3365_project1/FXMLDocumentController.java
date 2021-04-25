/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3365_project1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author hoefs
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button playBlackjackButton;
    @FXML
    private Button playPokerButton;
    @FXML
    private Button viewLeaderboardButton;
    @FXML
    private Label mainTitleLabel;
    @FXML
    private Button exitGameButton;
    @FXML
    private void playBlackjack(ActionEvent event) throws Exception{
        event.consume();
        try {

            Stage s = new Stage();
        new BlackjackGame().start(s);
       
    } catch(Exception e) {
        e.printStackTrace();
    }
    }
    
    @FXML
    private void viewLeaderboard(ActionEvent event) throws Exception{
        event.consume();
        try{
            Stage s = new Stage();
            new ViewLeaderboard().start(s);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
