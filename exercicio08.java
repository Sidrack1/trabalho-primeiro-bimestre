
package trab08;
    import java.util.Scanner;

public class Trab08 {

    public static void main(String[] args) {
        formaObjeto();
    }
    
    static void formaObjeto(){
        Scanner in= new Scanner(System.in);
        
            System.out.println("para calcular a area de um "
                    + "Triângulo: digite 1; "
                    + "Quadrado: digite 2; "
                    + "Retângulo: digite 3; "
                    + "Circulo: digite 4; "
                    + "Trapézio: digite 5; ");
            String forma = in.nextLine();
            
            if(forma.equals("1")){
        System.out.println("Digite o tamanho da base em cm: ");
        Double baseTri = in.nextDouble();
        System.out.println("Digite o tamanho da altura em cm: ");
        Double alturaTri = in.nextDouble();
            
        Double areaTri= (baseTri*alturaTri)/2;
            System.out.println("A area do Triângulo é: " + areaTri +" cm");
            }
            if(forma.equals("2")){
        System.out.println("Digite o tamanho do lado em cm: ");
        Double ladoQua = in.nextDouble();
        
        
        Double areaQua= ladoQua*ladoQua;
            System.out.println("A area do Quadrado é: " + areaQua +" cm");
            }
            if(forma.equals("3")){
        System.out.println("Digite o tamanho da base em cm: ");
        Double baseRet = in.nextDouble();
        System.out.println("Digite o tamanho da altura em cm: ");
        Double alturaRet = in.nextDouble();
        
        Double areaRet= baseRet*alturaRet;
            System.out.println("A area do Retângulo é: " + areaRet +" cm");
            }
            if(forma.equals("4")){
        System.out.println("Digite o tamanho do raio em cm: ");
        Double raioCir = in.nextDouble();
        Double elevado= 2.0;
        
        Double areaCir= Math.PI* (Math.pow(raioCir,elevado));
            System.out.println("A area do Circulo é: " + areaCir +" cm");
            }
            else{
                System.out.println("Digite o tamanho da base menor em cm: ");
                Double baseMenor= in.nextDouble();
                System.out.println("Digite o tamanho da base maior em cm: ");
                Double baseMaior= in.nextDouble();
                System.out.println("Digite a altura em cm: ");
                Double altura= in.nextDouble();
                
                Double areaTra= ((baseMaior + baseMenor)/2)*altura;
                System.out.println("A area do Trapézio é: " + areaTra +" cm");
            }
    }
}