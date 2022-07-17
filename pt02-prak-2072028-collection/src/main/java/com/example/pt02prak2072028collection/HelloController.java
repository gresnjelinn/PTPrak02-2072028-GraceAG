package com.example.pt02prak2072028collection;

import com.example.pt02prak2072028collection.model.DataMahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TextField inputNRP;
    public TextField inputNama;
    public TextField inputIPA;
    public TextField inputIPS;
    public Button btnInsert;
    public Button btnUpdate;
    public Button btnDelete;
    public TableView table;
    public TableColumn column1;
    public TableColumn column2;
    public TableColumn column3;
    public TableColumn column4;

    private ObservableList<DataMahasiswa> oList;

    public void initialize() {
        oList = FXCollections.observableArrayList(
                new DataMahasiswa("2070100", "Mahasiswa 1", 70, 80),
                new DataMahasiswa("2070200", "Mahasiswa 2", 80, 90),
                new DataMahasiswa("2070300", "Mahasiswa 3", 90, 90),
                new DataMahasiswa("2070400", "Mahasiswa 4", 90, 80),
                new DataMahasiswa("2070500", "Mahasiswa 5", 80, 70)
        );
        table.setItems(oList);
        column1.setCellValueFactory(new PropertyValueFactory<DataMahasiswa, Integer>("nrp"));
        column2.setCellValueFactory(new PropertyValueFactory<DataMahasiswa, String>("nama"));
        column3.setCellValueFactory(new PropertyValueFactory<DataMahasiswa, String>("nilaiIPA"));
        column4.setCellValueFactory(new PropertyValueFactory<DataMahasiswa, String>("nilaiIPS"));
    }

    public void insertStudent(ActionEvent actionEvent) {
        oList.add(new DataMahasiswa(inputNRP.getText(),
                inputNama.getText(),
                Integer.parseInt(inputIPA.getText()),
                Integer.parseInt(inputIPS.getText())
        ));
    }

    public void deleteStudent(ActionEvent actionEvent) {
        int selectedRow = table.getSelectionModel().getSelectedIndex();
        table.getItems().remove(selectedRow);
    }

    public void rowSelected(MouseEvent mouseEvent) {
        int selectedRow = table.getSelectionModel().getSelectedIndex();
        inputNRP.setText(oList.get(selectedRow).getNrp());
        inputNama.setText(oList.get(selectedRow).getNama());
        inputIPA.setText(String.valueOf(oList.get(selectedRow).getNilaiIPA()));
        inputIPS.setText(String.valueOf(oList.get(selectedRow).getNilaiIPS()));
    }

    public void updateStudent(ActionEvent actionEvent) {
        int selectedRow = table.getSelectionModel().getSelectedIndex();
        oList.get(selectedRow).setNrp(inputNRP.getText());
        oList.get(selectedRow).setNama(inputNama.getText());
        oList.get(selectedRow).setNilaiIPA(Integer.parseInt(inputIPA.getText()));
        oList.get(selectedRow).setNilaiIPS(Integer.parseInt(inputIPS.getText()));
        oList.set(selectedRow, oList.get(selectedRow));
    }
}