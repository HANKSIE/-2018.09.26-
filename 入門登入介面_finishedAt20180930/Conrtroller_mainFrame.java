package 入門登入介面_finishedAt20180930;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.util.ResourceBundle;

public class Conrtroller_mainFrame implements Initializable {

    @FXML Menu Game_File, Game_Record, Function, Exit;
    @FXML MenuItem exit, Encrypt_And_Decrypt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //處理gamefile下的選項和功能
        MenuItem OOXX_Game = new MenuItem("OOXX Game");
        Game_File.getItems().addAll(OOXX_Game);
        OOXX_Game.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StageManger.getStage("mainFrameStage").hide();
                StageManger.getStage("OOXXGameStage").show();
            }
        });

        Encrypt_And_Decrypt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StageManger.getStage("mainFrameStage").hide();
                StageManger.getStage("encryptAndDecryptStage").show();
            }
        });

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
    }
}
