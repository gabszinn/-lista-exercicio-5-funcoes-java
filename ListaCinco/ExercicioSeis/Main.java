import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        Metodo metodo = new Metodo();

        int soma = metodo.calcularSoma(numero1, numero2, numero3);
        System.out.println("A soma dos três números é: " + soma);

        scanner.close();
    }
}

