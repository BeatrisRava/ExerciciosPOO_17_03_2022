import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {

        int numero, total = 0;

        Scanner leitor = new Scanner (System.in);
        System.out.printf ("Digite um número para ver se ele é primo ou não: ");
        numero = leitor.nextInt();
        
        for (int contador = 1; contador <= numero; contador++ ){
            if(numero % contador == 0)
                total += 1;
        }
        System.out.printf (" O número %d foi divisivel %d vezes\n" , numero, total);
        
        System.out.printf (" O número %d " , numero);
        System.out.printf (total == 2 ? " É PRIMO " : " NÃO É PRIMO ");

        leitor.close();      
    }
}