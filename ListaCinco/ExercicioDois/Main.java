import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
Metodo metodo = new Metodo();

System.out.print("Informe o valor do produto: ");
metodo.setNumero(scanner.nextDouble());
scanner.close();

double valor = metodo.porcentagem(metodo.getNumero());

System.out.print("Novo valor do produto com aumento de 10% é: " + valor);






}
    
}
