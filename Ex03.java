import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
      
      int numero, contador, fatorial;

      Scanner leitor = new Scanner (System.in);
      System.out.printf ("Digite um número:");
      numero = leitor.nextInt();
      contador = numero;
      fatorial = 1;
      System.out.printf ("%d", numero);

      while (contador > 0){
        System.out.printf ("%d", contador);
        System.out.printf (contador > 1 ? " x " : " = ");
        fatorial *= contador;
        contador -= 1;
      }
      System.out.printf ("%d", fatorial);

      leitor.close();      
    }
}
