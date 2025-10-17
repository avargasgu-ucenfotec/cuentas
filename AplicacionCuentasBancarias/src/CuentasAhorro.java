public class CuentasAhorro {

    //Atributos
    private String id;
    private double saldo;
    private boolean activa;

    //Métodos
    //Constructor
    public CuentasAhorro(String id) {
        this.id = id;
        this.saldo = 100.0;
        this.activa = true;
    }

    //Getter
    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean estaActiva() {
        return activa;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de ahorro " + id + " está inactiva.");
            return;
        }
        if (saldo < 100.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de ahorro no pueden tener un saldo menor a $100.");
            return;
        }
        this.saldo = saldo;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    //String()
    public String toString() {
        return "\nCuenta de ahorro" +
                "\nID: " + id +
                "\nSaldo: $" + saldo +
                "\nEstado: " + (activa ? "Activa" : "Inactiva") +
                "\n";
    }

    //equals()
    public boolean equals(CuentasAhorro cuenta) {
        return (id.equals(cuenta.id));
    }
}
