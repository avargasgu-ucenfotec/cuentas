public class Administrador {

    //Atributos
    private String nombreCompleto;
    private String cedula;
    private String correoElectronico;

    //Métodos
    //Constructor
    public Administrador(String nombreCompleto, String cedula, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.correoElectronico = correoElectronico;
    }

    //Getter
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    //Setter
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    //String()
    public String toString() {
        return "\nNombre completo: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nCorreo electrónico: " + correoElectronico +
                "\n";
    }

    //equals()
    public boolean equals(Administrador administrador) {
        return (cedula.equals(administrador.cedula));
    }
}
