import java.util.Scanner;


public class Quest5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Digite o salário mínimo: ");
        double salarioMinimo = s.nextDouble();

        System.out.print("Digite seu salário:");
        double salarioUsuario = s.nextDouble();

        double QtdSalario = salarioUsuario / salarioMinimo;

        System.out.printf("O salário do usuario é %.2f" , QtdSalario);
    }
}