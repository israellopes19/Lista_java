import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

    System.out.println("Porcentagem IPI ");
    double IPI = s.nextDouble();

    System.out.println("Digite o valor da peça1");
    double valor1 = s.nextDouble();

    System.out.println("Digite quantidade de peça1");
    double quant1 = s.nextDouble();

    System.out.println("Digite o valor da peça2");
    double valor2 = s.nextDouble();
    System.out.println("Digite quantidade de peças2");
    double quant2 = s.nextDouble();

    double resultado = (valor1*quant1 + valor2*quant2) * (IPI/100 +1);
    System.out.print("O valor total a ser pago é : " + resultado);

    }
}
