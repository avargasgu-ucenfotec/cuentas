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
        miCuentaAhorro.setSaldo(150.0);

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

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaDebito);




    }
}