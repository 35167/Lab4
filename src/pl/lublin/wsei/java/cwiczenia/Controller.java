package pl.lublin.wsei.java.cwiczenia;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.fxml.FXML;
import java.io.File;

import javax.swing.*;

public class Controller {
    public Label lbFile;
    public ListView lstInfografiki;
    ObservableList<String> tytuly = FXCollections.observableArrayList();
    GusInfoGraphicList igList;
    FileChooser fileChooser= new FileChooser();
    FileChooser.ExtensionFilter xmlFilter = new FileChooser.ExtensionFilter("Pliki XML (*.xml)","*.xml");

    @FXML
    public void initialize(){
        fileChooser.getExtensionFilters().add(xmlFilter);
    }

    public void btnOpenFileAction(ActionEvent actionEvent) {
        File file = fileChooser.showOpenDialog(null);
        if (file != null) {
            igList = new GusInfoGraphicList(file.getAbsolutePath());
            lbFile.setText(file.getAbsolutePath());
            for (infografika ig: igList.infografiki) tytuly.add(ig.tytul);
            lstInfografiki.setItems(tytuly);
        }else{
            lbFile.setText("Proszę wczytać plik ...");
        }
    }
}
