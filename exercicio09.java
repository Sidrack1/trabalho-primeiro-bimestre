package trab09;
import java.util.Scanner;
public class Trab09 {

    public static void main(String[] args) {
        tipoTriangulo();
    }
    static void tipoTriangulo(){
        Scanner in= new Scanner(System.in);
        
        System.out.println("Digite o tamanho do lado 1: ");
        Double lado1= in.nextDouble();
        System.out.println("Digite o tamanho do lado 2: ");
        Double lado2= in.nextDouble();
        System.out.println("Digite o tamanho do lado 3: ");
        Double lado3= in.nextDouble();
        
        if(lado1.equals(lado2)){
            if (lado1.equals(lado3)){
                System.out.println("Triângulo equilátero");
            }
                else {
            System.out.println("Triângulo isósceles");
            }
        }
        else if(lado1.equals(lado3)) {
                System.out.println("Triângulo isósceles");    
                }
        else if(lado2.equals(lado3)){
            System.out.println("Triângulo isósceles");
        }
        else{
            System.out.println("Triângulo escaleno");
            }
        }
}