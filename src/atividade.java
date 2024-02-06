package teste;

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inteiros = new int[5];for
    }
    for (int i = 0; i < 5; i++) {
        System.out.println("digite o numero "+  + (i +1) + ":");
        numeros[i] = scanner.nextInt();
    }
    int maior = numeros[0];
    int menor = numeros[0];

    for (int i = 0; i < 5; i++) {
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }
}
