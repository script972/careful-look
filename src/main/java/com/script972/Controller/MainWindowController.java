package com.script972.Controller;

import com.script972.Model.Manipulate;
import com.script972.Model.User;
import com.script972.Model.ValueMaterial;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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


    @FXML
    TextField nameF;
    @FXML
    TextField countF;
    @FXML
    TextField deciminalF;
    @FXML
    TextField categoryF;
    @FXML
    TextField serialNumberF;


    @FXML
    TextField findname;
    @FXML
    TextArea outValue;


    @FXML
    TableView<ValueMaterial> tableValue;
    private ObservableList usersData = FXCollections.observableArrayList();
 /*<TableColumn fx:id="columID" prefWidth="40.0" text="id" />
                            <TableColumn fx:id="colmName" prefWidth="121.0" text="Назва" />
                            <TableColumn fx:id="columCount" prefWidth="64.0" text="Кількість" />
                            <TableColumn fx:id="columDeciminal" prefWidth="111.0" text="Міра виміру" />
                            <TableColumn fx:id="columCategory" prefWidth="107.0" text="Категорія" />
                            <TableColumn fx:id="columSerial" prefWidth="116.0" text="Серійний номер" />*/


    @FXML
    private TableView<User> tableUsers;

    @FXML
    private TableColumn<ValueMaterial, Integer> columID;

    @FXML
    private TableColumn<ValueMaterial, String> colmName;

    @FXML
    private TableColumn<ValueMaterial, Integer> columCount;

    @FXML
    private TableColumn<ValueMaterial, Integer> columCategory;
    @FXML
    private TableColumn<ValueMaterial, String> columSerial;

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
                String fxmlFile = "/fxml/operatingWindow.fxml";
                FXMLLoader loader = new FXMLLoader();
                Parent root = null;
                try {
                    root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.setTitle("Вінко операцій");
                stage.setScene(new Scene(root));
                stage.show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void addValue(ActionEvent actionEvent) {
        try {
            manipulate.addValue(nameF.getText(), countF.getText(), deciminalF.getText(), categoryF.getText(), serialNumberF.getText());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void initialize(){
        initData();

        // устанавливаем тип и значение которое должно хранится в колонке
        columID.setCellValueFactory(new PropertyValueFactory<ValueMaterial, Integer>("id"));
        colmName.setCellValueFactory(new PropertyValueFactory<ValueMaterial, String>("Name"));
        columCount.setCellValueFactory(new PropertyValueFactory<ValueMaterial, Integer>("count"));
        columCategory.setCellValueFactory(new PropertyValueFactory<ValueMaterial, Integer>("category"));
        // заполняем таблицу данными
        tableUsers.setItems(usersData);
    }

    public void findValue(ActionEvent actionEvent) throws SQLException {
        manipulate.findValue(findname.getText());

    }

    private void initData() {
        usersData.add(new ValueMaterial(1, "Alex", "2", "cm", "1", "22222"));


    }
}
