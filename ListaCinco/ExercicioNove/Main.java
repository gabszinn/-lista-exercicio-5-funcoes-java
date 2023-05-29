import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        Metodo metodo = new Metodo();
        metodo.setNumero(numero);

        int reverso = metodo.calcularReverso();

        System.out.println("O reverso do número é: " + reverso);

        scanner.close();
    }
}