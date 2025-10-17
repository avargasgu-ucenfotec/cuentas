public class CuentasAhorro {

    //Atributos
    private String id;
    private double saldo;

    //Métodos
    //Constructor
    public CuentasAhorro(String id) {
        this.id = id;
        this.saldo = 100.0;
    }

    //Getter
    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        if (saldo < 100.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de ahorro no pueden tener un saldo menor a $100.");
            return;
        }
        this.saldo = saldo;
    }

    //String()
    public String toString() {
        return "\nCuenta de ahorro" +
                "\nID: " + id +
                "\nsaldo: $" + saldo +
                "\n";
    }

    //equals()
    public boolean equals(CuentasAhorro cuenta) {
        return (id.equals(cuenta.id));
    }
}
