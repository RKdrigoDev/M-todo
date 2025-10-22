import java.util.Scanner;

//descobrir se o inverso da palavra é o mesmo que a sua forma direta
public class exercicio01 {
    public static void main(String[] args) {
        String[] palavra=new String[4];
        LerPalavra(palavra);
        LocalizarPar(palavra);
    }

    public static void LocalizarPar(String[] palavra){
        String inverso;
        boolean achou=false;
        for (int j=0; j<palavra.length;j++){
            inverso=inverter(palavra[j]);
            for (int i=j+1; i < palavra.length; i++){
                if(inverso.equalsIgnoreCase(palavra[i])){
                    System.out.println("("+palavra[j]+","+palavra[i]+")");
                    achou=true;
                }
            }
            if (achou == false){
                System.out.println("não há pares de inverso");
            }
        }
    }
    public static String inverter(String palavra){
        char aux;
        int j=palavra.length()-1;
        char[] letra=palavra.toCharArray();
        for (int i = 0; i < palavra.length()/2; i++){
            aux=letra[i];
            letra[i]=letra[j];
            letra[j]=aux;
            j--;
        }
        return new String(letra);
    }

    public static void LerPalavra(String[] palavra){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<palavra.length; i++){
            System.out.println("palavra --> ");
            palavra[i]=sc.next();
        }
    }
}
