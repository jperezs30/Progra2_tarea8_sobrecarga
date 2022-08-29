package tarea8;

public class OperacionMatematica {

    public static void main(String[] params) {
        OperacionMatematica op = new OperacionMatematica();
        System.out.println(op.sumar(1,4));
        System.out.println(op.sumar(1.4,2.2));
    }

    int sumar(int valor1, int valor2) {
        System.out.println("Suma de enteros: ");
        return valor1 + valor2;
    }

    double sumar(double valor1, double valor2) {
        System.out.println("Suma de flotantes: ");
        return valor1 + valor2;
    }

}
