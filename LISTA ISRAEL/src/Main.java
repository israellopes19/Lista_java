import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os anos de vida:");
        double anos = s.nextDouble();
        System.out.println("Digite os meses de vida:");
        double meses = s.nextDouble();
        System.out.println("Digite os dias de vida:");
        double dias = s.nextDouble();

        double contagem = (anos * 365 ) + (meses * 31) + dias;

        System.out.printf(" O dias de sua vida sao %.1f", contagem);





    }
}