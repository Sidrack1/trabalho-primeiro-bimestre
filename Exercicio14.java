package exercicio14;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Double primeiroN= in.nextDouble();
        System.out.println("Digite 1 para Adição; 2 para Subtração;"
                + " 3 para Multiplicação; 4 para Divisão; 5 para mais opções:");
        Double operando= in.nextDouble();
        if(operando==1){
            System.out.println("Digite o segundo numero: ");
            Double segundoN= in.nextDouble();
        Double result1=primeiroN+segundoN;
            System.out.println("o resultado é: "+result1);
    }
        if(operando==2){
        System.out.println("Digite o segundo numero: ");
            Double segundoN= in.nextDouble();
        Double result2=primeiroN-segundoN;
            System.out.println("o resultado é: "+result2);
        }
        if(operando==3){
            System.out.println("Digite o segundo numero: ");
            Double segundoN= in.nextDouble();
        Double result3=primeiroN*segundoN;
            System.out.println("o resultado é: "+result3);
        }
        if(operando==4){
            System.out.println("Digite o segundo numero: ");
            Double segundoN= in.nextDouble();
        Double result4=primeiroN/segundoN;
            System.out.println("o resultado é: "+result4);
    }
        if(operando==5){
            System.out.println("Digite 6 para potência; 7 para fatorial: ");
            Double operando2= in.nextDouble();
            if(operando2==6){
                System.out.println("Digite o numero da potência: ");
                Double pot= in.nextDouble();
                Double result6= Math.pow(primeiroN, pot);
                System.out.println("o resultado é: "+result6);
            }
            if(operando2==7){
                int fat = 1;
                Double valor = primeiroN;
                for(int i = 2; i <= valor; i++){ 
                fat *= i;
            }
            System.out.println( "o resultado é: "+ fat);
            }
        }
    }
}
