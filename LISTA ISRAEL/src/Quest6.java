import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = s.nextInt();
        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.printf("O numero é %d,o seu sucessor é %d e seu antecessor é %d",
                numero,sucessor,antecessor);
    }
}
