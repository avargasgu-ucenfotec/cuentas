public class CuentasDebito {

    //Atributos
    private String id;
    private double saldo;

    //Métodos
    //Constructor
    public CuentasDebito(String id) {
        this.id = id;
        this.saldo = 0.0;
    }

    public CuentasDebito(String id, double saldo) {
        this.id = id;
        this.saldo = saldo;
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
        if (saldo < 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de débito no pueden tener un saldo menor a $0.");
            return;
        }
        this.saldo = saldo;
    }

    //String()
    public String toString() {
        return "\nCuenta de débito" +
                "\nID: " + id +
                "\nsaldo: $" + saldo +
                "\n";
    }

    //equals()
    public boolean equals(CuentasDebito cuenta) {
        return (id.equals(cuenta.id));
    }
}
