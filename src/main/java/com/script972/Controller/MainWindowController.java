package com.script972.Controller;

import com.script972.Model.Manipulate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by script972 on 16.12.2016.
 */

public class MainWindowController {
    @FXML
    TextField login;
    @FXML
    TextField password;

    Manipulate manipulate=new Manipulate();

    public void varified(ActionEvent actionEvent) {
        if(login.getText()==null || password.getId()==null) {
            System.out.println("поля пусты");
            return;
        }
        try {
            if (manipulate.varified(login.getText(), password.getText())==false)
                System.out.println("Логин или пароль подпадает под джихад");
            else {/*В зависимости от типа доступа открывать соответствующие окно*/
                System.out.println("добро пожаловать");
                Stage stage=new Stage();
                String fxmlFile = "/fxml/mainWindow.fxml";
                FXMLLoader loader = new FXMLLoader();
                Parent root = null;
                try {
                    root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.setTitle("JavaFX and Maven");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
