package teste;

import java.util.Scanner;

class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somadasnotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("digite a nota do aluno" + i + ":");
            double nota = scanner.nextDouble();
            somadasnotas += nota;

        }
        double media = somadasnotas / 3;
        System.out.println("A média das notas é:" + media);
    }
    
}
