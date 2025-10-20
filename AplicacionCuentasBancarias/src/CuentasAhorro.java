public class CuentasAhorro {

    //Atributos
    private String id;
    private double saldo;
    private boolean activa;
    private double porcentajeInteres;

    //Métodos
    //Constructor
    public CuentasAhorro(String id) {
        this.id = id;
        this.saldo = 100.0;
        this.activa = true;
        this.porcentajeInteres = 0.01;
    }

    public CuentasAhorro(String id, double porcentajeInteres) {
        this.id = id;
        this.saldo = 100.0;
        this.activa = true;
        this.porcentajeInteres = porcentajeInteres;
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

    public double getPorcentajeInteres() {
        return porcentajeInteres;
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

    public void setPorcentajeInteres(double porcentaje) {
        this.porcentajeInteres = porcentaje;
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

    //Funcionales
    public void retiro(double monto) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de ahorro " + id + " está inactiva.");
            return;
        }
        if (saldo - monto < 100.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de ahorro no pueden tener un saldo menor a $100.");
            System.out.println("El retiro solicitado no se realizó.");
            return;
        }
        setSaldo(saldo - monto);
    }

    public void pago(double monto) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de ahorro " + id + " está inactiva.");
            return;
        }
        if (saldo - monto < 100.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de ahorro no pueden tener un saldo menor a $100.");
            System.out.println("El pago solicitado no se realizó.");
            return;
        }
        setSaldo(saldo - monto);
    }

    public void deposito(double monto) {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de ahorro " + id + " está inactiva.");
            return;
        }
        if (monto < 0.0) {
            System.out.println("Operación no válida.");
            System.out.println("Las cuentas de ahorro no puede recibir un depósito negativo.");
            System.out.println("El depósito solicitado no se realizó.");
            return;
        }
        setSaldo(saldo + monto);
    }

    public void aplicarIntereses() {
        if (!estaActiva()) {
            System.out.println("Operación no válida.");
            System.out.println("La cuenta de ahorro " + id + " está inactiva.");
            return;
        }
        setSaldo((1.0 + porcentajeInteres) * saldo);
    }
}
