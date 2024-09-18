import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        //Questão 2:
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String string = sc.next();
        int contador = 0;
        string = string.toLowerCase();
        for(int x = 0; x < string.length(); x++){
            if(string.charAt(x) == 'a'){
                contador++;
            }
        }
        if(contador == 0){
            System.out.println("A palavra informada não contem a letra a");
        }else{
            System.out.print(String.format("\nA letra A aparece %d vezes", contador));
        }
    }
}
