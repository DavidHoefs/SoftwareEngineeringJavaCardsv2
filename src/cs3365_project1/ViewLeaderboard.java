/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3365_project1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collection;
import java.util.stream.Collectors;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hoefs
 */
public class ViewLeaderboard extends Application {
    @Override
    public  void start(Stage primaryStage) throws IOException{
        Collection<LeaderboardData> list = Files.readAllLines(new File("C:\\\\Users\\\\hoefs\\\\Documents\\BlackjackScoreBoard.txt").toPath())
                        .stream()
                        .map(line -> {
                            String[] details = line.split(",");
                            LeaderboardData cd = new LeaderboardData();
                            cd.setScore(details[0]);
                            

                            return cd;
                        })
                        .collect(Collectors.toList());

        ObservableList<LeaderboardData> details = FXCollections.observableArrayList(list);
        
        TableView<LeaderboardData> tableView = new TableView<>();
        TableColumn<LeaderboardData, String> col1 = new TableColumn<>();
        tableView.getColumns().addAll(col1);
        
        col1.setCellValueFactory(data -> data.getValue().scoreProperty());
        tableView.setItems(details);

        StackPane sp = new StackPane(tableView);
        Scene scene = new Scene(sp);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private class LeaderboardData 
    {
        StringProperty score = new SimpleStringProperty();
                public final StringProperty scoreProperty() {
            return this.score;
        }

        public final java.lang.String getScore() {
            return this.scoreProperty().get();
        }

        public final void setScore(final java.lang.String score) {
            this.scoreProperty().set(score);
        }
    }
    }

