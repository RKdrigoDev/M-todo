import java.util.Scanner;

public class raiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,delta;
        double[]raiz;
        System.out.println("a --> ");
        a=sc.nextDouble();
        if (a==0){
            System.out.println("não é uma equação de segundo grau");
        }
        else {
            System.out.println("b --> ");
            b=sc.nextDouble();
            System.out.println("c --> ");
            c=sc.nextDouble();
            delta=calculardelta(a,b,c);
            if (delta<0){
                System.out.println("a equação não tem raiz real");
            }
            else{
                raiz=calcularRaiz(a,b,delta);
                System.out.println("x1= "+raiz[0]);
                System.out.println("x1= "+raiz[1]);

            }
        }

    }

    public static double calculardelta(double a, double b, double c) {
return b*b-4*a*c;
    }
    public static double[] calcularRaiz(double a, double b, double delta ){
        double[] raiz= new double[2];
        raiz[0]=(-b +Math.sqrt(delta))/(2*a);
                raiz[1]=(-b+Math.sqrt(delta))/(2*a);
                return raiz;
    }
}
