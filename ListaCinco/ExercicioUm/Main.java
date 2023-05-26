import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    MediaAritmetica media = new MediaAritmetica();
    System.out.println("Digite o primeiro numero: ");
    media.setNumeroUm(scanner.nextDouble());
    
    System.out.println("Digite o segundo numero: ");
    media.setNumeroDois(scanner.nextDouble());
    scanner.close();
    double numeroUm = media.getNumeroUm();
    double numeroDois = media.getNumeroDois();
    System.out.println("A média aritmética entre os numeros é: " + media.mediaAritmetica(numeroUm, numeroDois));
  
     }

    
}
