import java.util.Scanner;

public class Quest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu saldo:");
        double saldo = s.nextDouble();

        double reajuste = 0.01 ;

        double reajustar = (reajuste * saldo) + saldo;

        System.out.printf(" O seu saldo e R$ %.2f" ,reajustar);
    }
}
