
package trab05;
    import java.util.Scanner;
public class Trab05 {

    public static void main(String[] args) {
		situacaoFinal();		
	}
    
	static void situacaoFinal(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite sua média: ");
		double nota = in.nextDouble();
		
		System.out.println(resultadoNotas(nota));
	}
        
	static String resultadoNotas(double nota){
		if(nota >= 7)
                    return "Aprovado";
		else if(nota >= 4 && nota < 7)
                    return "Em exame";
		else 
                    return "Reprovado";
	}
}