import java.util.Scanner; 
public class Main {

public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 Segundo grausC = new Segundo();

    System.out.println("Algoritmo que transforma graus fahrenheit em graus celsius.");
    System.out.println("Digite a temperatura em graus fahrenheit: ");
    grausC.setGrausF(scanner.nextDouble());

    double resultado = grausC.calcular(grausC.getGrausF());
    System.out.printf("A temperatura em graus celsius é:%.2f" , resultado);
    
    scanner.close();



}
}