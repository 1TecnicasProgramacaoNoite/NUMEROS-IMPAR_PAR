
package numerosimparpar;

import java.util.Scanner;


public class NumerosImparPar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //declaracao de variaveis
        float num, res;
        
        //apresentacao
        System.out.println("\n\t\t***IDENTIFICANDO DE NUMERO IMPAR OU PAR***\n");
        
        //entrada de dados
        System.out.print("Digite um numero: ");
        num = entrada.nextFloat();
        
        //processamento
        res = num%2;
        
        //saida de dados
        if (res!=0) {
            System.out.println("O numero é IMPAR!");
        } else {
            System.out.println("O numero é PAR!");
        }
    }
}
