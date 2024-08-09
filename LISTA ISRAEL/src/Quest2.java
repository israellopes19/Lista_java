import java.util.Scanner;


public class Quest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = 7;
        int n2 = 8;
        int n3 = 9;

        int media = (n1+n2+n3) / 3;

        System.out.println("Media é " +media);

        int n4 = 4;
        int n5 = 5;
        int n6 = 6;

        int media2 = (n4+n5+n6) / 3;

        System.out.println("Media é " +media2);


        double soma =(double) (media + media2) / 2;

        System.out.println("Media das medias " +soma);
    }
}