package trab12;
import java.util.Scanner;

public class Trab12 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Integer tam= 10;
        Double vetor[]= new Double[tam];
        Integer i;
    
            for(i=0; i<tam; i++){
                System.out.println("Digite o valor de " +(i+1)+ ":");
                vetor[i]= in.nextDouble();
            }
            Double soma=0.0;
            for(i=0; i<tam; i++){
                soma= soma+ vetor[i];
            }
            System.out.println("A soma desses valores é igual a: " +soma);  
    }                 
}