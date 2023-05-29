import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        Medias medias = new Medias();
        medias.setValores(valor1, valor2, valor3);

        double mediaAritmetica = medias.calcularMediaAritmetica();
        double mediaHarmonica = medias.calcularMediaHarmonica();
        double mediaGeometrica = medias.calcularMediaGeometrica();

        System.out.printf("Média Aritmética:%.2f " , mediaAritmetica);
        System.out.printf("Média Harmônica:%.2f " , mediaHarmonica);
        System.out.printf("Média Geométrica:%.2f " , mediaGeometrica);

        scanner.close();
    }
}
