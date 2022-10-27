package hu.petrik.emberektablazat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberekController {
    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, String> nev;
    @FXML
    private TableColumn<Ember, Integer> kor;


    @FXML
    private void initialize(){
        nev.setCellValueFactory(new PropertyValueFactory<>("név"));
        nev.setCellValueFactory(new PropertyValueFactory<>("kor"));
        Ember e1 = new Ember("Gipsz Jakab",25);
        Ember e2 = new Ember("Teszt Elek",52);
        Ember e3 = new Ember("Lakatos Brendon Károly",11);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);

    }
}