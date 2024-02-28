package org.example.gestorempleadosnew;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.gestorempleadosnew.models.Enfermero;
import org.example.gestorempleadosnew.models.GestorEmpleado;
import org.example.gestorempleadosnew.models.Medico;
import org.example.gestorempleadosnew.models.ProfesionalDeLaSalud;

import java.net.URL;
import java.util.ResourceBundle;
public class HelloController implements Initializable {
    private ObservableList<ProfesionalDeLaSalud> profesionales;
    private GestorEmpleado admin=new GestorEmpleado();
    @FXML private ListView<ProfesionalDeLaSalud>ltsProfesionales;
    @FXML private ListView<ProfesionalDeLaSalud>ltsEnfermero;
    @FXML private TextField txtNombreMedico;
    @FXML private TextField txtApellidoPaternoMedico;
    @FXML private TextField txtApellidoMaternoMedico;
    @FXML private TextField txtIdentificadorMedico;
    @FXML private TextField txtLicenciaMedica;
    @FXML private TextField txtNombreEnfermero;
    @FXML private TextField txtApellidoPaternoEnfermero;
    @FXML private TextField txtApellidoMaternoEnfermero;
    @FXML private TextField txtIdentificadorEnfermero;
    @FXML private TextField txtRolDeEnfermero;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        profesionales = FXCollections.observableArrayList();
        ltsProfesionales.setItems(profesionales);
        ltsEnfermero.setItems(profesionales);

    }

    @FXML
    public void guardar(){
        profesionales.add(
                new Medico(txtNombreMedico.getText(),txtApellidoPaternoMedico.getText(),txtApellidoMaternoMedico.getText(),txtIdentificadorMedico.getText(),txtLicenciaMedica.getText())
        );
        ltsProfesionales.setItems(profesionales);

    }
    @FXML
    public void guardarEnfermero(){
        profesionales.add(
                new Enfermero(txtNombreEnfermero.getText(),txtApellidoPaternoEnfermero.getText(),txtApellidoMaternoEnfermero.getText(),txtIdentificadorEnfermero.getText(),txtRolDeEnfermero.getText())

        );
        ltsEnfermero.setItems(profesionales);
    }


}