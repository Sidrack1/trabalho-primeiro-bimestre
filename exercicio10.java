package trab10;
import java.util.Scanner;
public class Trab10 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
                System.out.println("digite o tamanho do lado maior: ");
                Double ladoA= in.nextDouble();
                System.out.println("digite o tamanho do lado medio: ");
                Double ladoB= in.nextDouble();
                System.out.println("digite o tamanho do lado menor: ");
                Double ladoC= in.nextDouble();
                if((ladoA-ladoB)<ladoC){
                    if(ladoC<(ladoA+ladoB)){
                        System.out.println("os lados podem formar um triângulo");
                    }}
                    else if((ladoB-ladoA)<ladoC){
                        if (ladoC<(ladoB+ladoA)){
                            System.out.println("os lados podem formar um triângulo");
                    }}
                    else if((ladoA-ladoC)<ladoB){
                        if(ladoB<(ladoA+ladoC)){
                            System.out.println("os lados podem formar um triângulo");
                    }}
                    else if((ladoC-ladoA)<ladoB){
                        if(ladoB<(ladoC+ladoA)){
                            System.out.println("os lados podem formar um triângulo");
                    }}
                    else if((ladoB-ladoC)<ladoA){
                        if(ladoA<(ladoB+ladoC)){
                            System.out.println("os lados podem formar um triângulo");
                    }}
                    else if((ladoC-ladoB)<ladoA){
                        if(ladoA<(ladoC+ladoB)){
                            System.out.println("os lados podem formar um triângulo");
                    }}
                    else{
                        System.out.println("os lados não podem formar um triângulo");
                        }
                }
}
