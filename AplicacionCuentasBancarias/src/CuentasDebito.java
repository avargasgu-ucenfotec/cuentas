public class CuentasDebito {

    //Atributos
    private String id;
    private double saldo;
    private boolean activa;

    //Métodos
    //Constructor
    public CuentasDebito(String id) {
        this.id = id;
        this.saldo = 0.0;
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
            System.out.println("La cuenta de débito " + id + " está inactiva.");
            return;
        }
        if (saldo < 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de débito no pueden tener un saldo menor a $0.");
            return;
        }
        this.saldo = saldo;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    //String()
    public String toString() {
        return "\nCuenta de débito" +
                "\nID: " + id +
                "\nSaldo: $" + saldo +
                "\nEstado: " + (activa ? "Activa" : "Inactiva") +
                "\n";
    }

    //equals()
    public boolean equals(CuentasDebito cuenta) {
        return (id.equals(cuenta.id));
    }

    //Funcionales
    public void retiro(double monto) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de débito " + id + " está inactiva.");
            return;
        }
        if (saldo - monto < 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de débito no pueden tener un saldo menor a $0.");
            System.out.println("El retiro solicitado no se realizó.");
            return;
        }
        setSaldo(saldo - monto);
    }

    public void pago(double monto) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de débito " + id + " está inactiva.");
            return;
        }
        if (saldo - monto < 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de débito no pueden tener un saldo menor a $0.");
            System.out.println("El pago solicitado no se realizó.");
            return;
        }
        setSaldo(saldo - monto);
    }

    public void deposito(double monto) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de débito " + id + " está inactiva.");
            return;
        }
        if (monto < 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de débito no puede recibir un depósito negativo.");
            System.out.println("El depósito solicitado no se realizó.");
            return;
        }
        setSaldo(saldo + monto);
    }
}
