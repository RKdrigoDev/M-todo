import java.util.Scanner;

public class Exemplo01String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1, s2;
        int x;
        System.out.println("frase --> ");
        s2=sc.nextLine();
        System.out.println("valor --> ");
        x=sc.nextInt();
        System.out.println("palavra --> ");
        s1=sc.next();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(x);
    }

}
