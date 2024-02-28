package org.example.gestorempleadosnew.models;

public class Medico extends ProfesionalDeLaSalud{
    private String licencia;

    public Medico(String nombre, String apellidoPaterno, String apellidoMaterno, String idIdentificador, String departamento) {
        super(nombre, apellidoPaterno, apellidoMaterno, idIdentificador, departamento);
    }

    public Medico() {

    }




    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }


    public String toString() {
        return "Medico{" +
                "licencia='" + licencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", idIdentificador='" + idIdentificador + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
