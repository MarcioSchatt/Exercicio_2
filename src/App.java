import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
    
        System.out.println("Digite um número:");
    
        int num = numero.nextInt();
        numero.close();
    
        System.out.println("O número informado foi: " + num);
      }
}