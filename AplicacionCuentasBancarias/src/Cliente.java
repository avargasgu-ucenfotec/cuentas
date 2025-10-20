import java.util.ArrayList;

public class Cliente {

    //Atributos
    private String nombreCompleto;
    private String cedula;
    private char sexo;
    private String correoElectronico;
    private String profesion;
    private String direccion;
    private final ArrayList<CuentasAhorro> cuentasAhorros;
    private final ArrayList<CuentasDebito> cuentasDebito;
    private final ArrayList<CuentasCredito> cuentasCredito;

    //Métodos
    //Constructor
    public Cliente(String nombreCompleto, String cedula, char sexo, String correoElectronico, String profesion,
                   String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.sexo = sexo;
        this.correoElectronico = correoElectronico;
        this.profesion = profesion;
        this.direccion = direccion;
        cuentasAhorros = new ArrayList<>();
        cuentasDebito = new ArrayList<>();
        cuentasCredito = new ArrayList<>();
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //String()
    public String toString() {
        return "\nNombre completo: " + nombreCompleto +
                "\nCédula: " + cedula +
                "\nSexo: " + sexo +
                "\nCorreo electrónico: " + correoElectronico +
                "\nProfesión: " + profesion +
                "\nDirección: " + direccion +
                "\n";
    }

    //equals()
    public boolean equals(Cliente cliente) {
        return (cedula.equals(cliente.cedula));
    }
}
