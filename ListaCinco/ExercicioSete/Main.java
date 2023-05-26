import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        Metodo metodo = new Metodo();
        metodo.setNumero(numero);

        char resultado = metodo.verificarNumero();

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}