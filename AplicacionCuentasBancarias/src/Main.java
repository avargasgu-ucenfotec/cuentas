//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Aplicación de gestión de cuentas bancarias");

        //Crear una cuenta de ahorro con $100 por defecto
        CuentasAhorro miCuentaAhorro = new CuentasAhorro("A0001");

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar asignar un saldo no válido a la cuenta de ahorro
        miCuentaAhorro.setSaldo(50.0);

        //Asignar un valor válido a la cuenta de ahorro
        miCuentaAhorro.setSaldo(350.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Desactivar cuenta de ahorro
        miCuentaAhorro.setActiva(false);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar asignar un valor válido a la cuenta de ahorro inactiva
        miCuentaAhorro.setSaldo(300.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Activar cuenta de ahorro
        miCuentaAhorro.setActiva(true);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar retirar un monto mayor al disponible en la cuenta de ahorros
        miCuentaAhorro.retiro(1000.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar retirar un monto válido de la cuenta de ahorros
        miCuentaAhorro.retiro(50.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar pagar un monto mayor al disponible en la cuenta de ahorros
        miCuentaAhorro.pago(1000.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar pagar un monto válido de la cuenta de ahorros
        miCuentaAhorro.pago(50.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar hacer un depósito por un monto no válido a la cuenta de ahorros
        miCuentaAhorro.deposito(-50.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar hacer un depósito por un monto válido a la cuenta de ahorros
        miCuentaAhorro.deposito(50.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Intentar aplicar los intereses asociados a la cuenta de ahorros
        miCuentaAhorro.aplicarIntereses();

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro);

        //Crear una cuenta de débito con $0 por defecto
        CuentasDebito miCuentaDebito = new CuentasDebito("D0001");

        //Imprimir cuenta de débito
        System.out.println(miCuentaDebito);

        //Intentar asignar un saldo no válido a la cuenta de débito
        miCuentaDebito.setSaldo(-100.0);

        //Asignar un valor válido a la cuenta de ahorro
        miCuentaDebito.setSaldo(200.0);

        //Imprimir cuenta de débito
        System.out.println(miCuentaDebito);

        //Crear una cuenta de crédito con un límite crediticio de $10000
        CuentasCredito miCuentaCredito = new CuentasCredito("C0001");
        miCuentaCredito.setLimiteCredito(10000.0);

        //Imprimir cuenta de crédito
        System.out.println(miCuentaCredito);

        //Intentar asignar un saldo no válido a la cuenta de crédito
        miCuentaCredito.setSaldo(-15000.0);

        //Asignar un valor válido a la cuenta de ahorro
        miCuentaCredito.setSaldo(-5000.0);

        //Imprimir cuenta de crédito
        System.out.println(miCuentaCredito);
    }
}