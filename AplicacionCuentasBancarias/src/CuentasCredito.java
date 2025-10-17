public class CuentasCredito {

    //Atributos
    private String id;
    private double saldo;
    private boolean activa;
    private double limiteCredito;

    //Métodos
    //Constructor
    public CuentasCredito(String id) {
        this.id = id;
        this.saldo = 0.0;
        this.activa = true;
        this.limiteCredito = 0.0;
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

    public double getLimiteCredito() {
        return limiteCredito;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de crédito " + id + "está inactiva.");
            return;
        }
        if (saldo > 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de crédito no pueden tener un saldo mayor a $0.");
            return;
        }
        if (-1 * saldo > limiteCredito) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de crédito no pueden tener un saldo mayor a su límite crediticio.");
            return;
        }
        this.saldo = saldo;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de crédito " + id + " está inactiva.");
            return;
        }
        if (-1 * limiteCredito > 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de crédito no pueden tener un límite de crédito menor a $0.");
            return;
        }
        this.limiteCredito = limiteCredito;
    }

    //String()
    public String toString() {
        return "\nCuenta de crédito" +
                "\nID: " + id +
                "\nSaldo: $" + saldo +
                "\nEstado: " + (activa ? "Activa" : "Inactiva") +
                "\nLímite crediticio: $" + limiteCredito +
                "\n";
    }

    //equals()
    public boolean equals(CuentasCredito cuenta) {
        return (id.equals(cuenta.id));
    }
}
