import java.util.Scanner;

//ler frase e imprimir quantidades de vogais
public class Exemplo2String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase;
        int TotalVogais=0;
        char[] letra;
        char aux;
        System.out.println("digite uma frase --> ");
        frase=sc.nextLine();
        letra=frase.toCharArray();
        for (int i=0; i<letra.length;i++){
            System.out.print("\t"+letra[i]);
        }
        System.out.println();
        for (char c : letra){
            System.out.print("\t"+c);
        }
        //contagem de vogais
        frase=frase.toLowerCase();
        for (int i=0;i<frase.length(); i++){
            aux=frase.charAt(i);
            switch (aux){
                case 'a':
                    case'e':
                case 'i':
                case 'o':
                case 'u':
                    TotalVogais++;
                    break;


            }
        }
        System.out.println();
        System.out.println(" \ttotal de vogais = "+TotalVogais);
    }
}
