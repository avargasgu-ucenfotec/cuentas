//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Aplicación de gestión de cuentas bancarias");

        //Crear una cuenta de ahorro con $100 por defecto
        CuentasAhorro miCuentaAhorro1 = new CuentasAhorro("00001");

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro1);

        //Intentar asignar un saldo no válido a la cuenta de ahorro
        miCuentaAhorro1.setSaldo(50.0);

        //Asignar un valor válido a la cuenta de ahorro
        miCuentaAhorro1.setSaldo(150.0);

        //Imprimir cuenta de ahorro
        System.out.println(miCuentaAhorro1);




    }
}