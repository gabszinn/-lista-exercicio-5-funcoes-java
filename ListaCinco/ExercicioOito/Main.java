import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo do item: ");
        float custo = scanner.nextFloat();

        System.out.print("Digite a taxa de imposto sobre vendas (%): ");
        float taxaImposto = scanner.nextFloat();

        Metodo metodo = new Metodo();
        metodo.setCusto(custo);
        metodo.setTaxaImposto(taxaImposto);

        float custoComImposto = metodo.somaImposto();

        System.out.printf("O custo com imposto é:%.2f " , custoComImposto);

        scanner.close();
    }
}
