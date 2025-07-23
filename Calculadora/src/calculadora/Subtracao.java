package calculadora;

import java.util.Scanner;

/**
 *
 * @author info2
 */
public class Subtracao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o primeiro número");
        int n1 = teclado.nextInt();
        
        System.out.println("digite o segundo número");
        int n2 = teclado.nextInt();
        
        System.out.println("a subtracao dos números é : " + (n1-n2));
    }
}
