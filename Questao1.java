import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        //Questão 1:
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int entrada,num1 = 0,num2 = 1,soma = 0;
        entrada = sc.nextInt();

        for(int x = 0; x <= entrada; x++){
            num1 = num2;
            num2 = soma;
            soma = num1 + num2;
            if(soma == entrada){
                System.out.println("Este número pertence a sequência de Fibonacci.");
            break;
            }
        }
        if (soma!=entrada){
            System.out.println("Este número não faz parte da sequência de Fibonacci.");
        }
        sc.close();
    }
}