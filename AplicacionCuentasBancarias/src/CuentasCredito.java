public class CuentasCredito {

    //Atributos
    private String id;
    private double saldo;
    private boolean activa;
    private double limiteCredito;
    private String tipo;

    //Métodos
    //Constructor
    public CuentasCredito(String id) {
        this.id = id;
        this.saldo = 0.0;
        this.activa = true;
        this.limiteCredito = 0.0;
        this.tipo = null;
    }

    public CuentasCredito(String id, String tipo) {
        this.id = id;
        this.saldo = 0.0;
        this.activa = true;
        this.limiteCredito = 0.0;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
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

    public void setActiva(boolean activa) {
        this.activa = activa;
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

    public void setTipo(String tipo) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de crédito " + id + " está inactiva.");
            return;
        }
        if (tipo.equals("Cashback") || tipo.equals("Gane Premios") || tipo.equals("Millas")) {
            this.tipo = tipo;
        } else {
            System.out.println("Operación no válida.");
            System.out.println("Tipos disponibles: Cashback, Gane Premios y Millas.");
        }
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

    //Funcionales
    public void retiro(double monto) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de crédito " + id + " está inactiva.");
            return;
        }
        if (saldo + -1 * monto > 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de crédito no pueden tener un saldo mayor a $0.");
            System.out.println("El retiro solicitado no se realizó.");
            return;
        }
        if (saldo + -1 * monto < -1 * limiteCredito) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de crédito no pueden tener un saldo mayor al límite de crédito.");
            System.out.println("El retiro solicitado no se realizó.");
            return;
        }
        setSaldo(saldo + -1 * monto);
    }

    public void pago(double monto) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de crédito " + id + " está inactiva.");
            return;
        }
        if (saldo + -1 * monto < -1 * limiteCredito) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de crédito no pueden ejecutar un pago que exceda el límite de crédito.");
            System.out.println("El pago solicitado no se realizó.");
            return;
        }
        setSaldo(saldo + -1 * monto);
    }
}
