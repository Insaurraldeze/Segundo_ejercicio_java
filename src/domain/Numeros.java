package domain;
//pedirle a usuario que ingrese un numero entre 1 y 10 y decir si es par o impar, usar metodos y POO.

import java.util.Scanner;

public class Numeros {

    private int numero;

    public Numeros() {
        this.numero = numero;
    }

    public int Getnumero() {
        return numero;
    }

    public int pedir() {
        do {
            System.out.println("ingrese un numero entre 1 y 10: ");
            Scanner in = new Scanner(System.in);
            numero = in.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("numero invalido:");
            }
        } while ((numero < 1) || (numero > 10));
        return numero;
    }

    public void imprimir() {
        if (numero % 2 == 0) {
            System.out.println("es par" + numero);

        } else {
            System.out.println("es impar" + numero);

        }
    }

}
