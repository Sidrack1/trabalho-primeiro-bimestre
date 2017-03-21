package exercicio16;
import java.util.Scanner;

public class Exercicio16 {

    static String[] nome1 = new String[10];
    static int cont = 0;

	public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String nome = "";
            String op = "1";

		do {
                    if(cont <= 9){
                        System.out.println("Digite Seu Nome: ");
                        nome = sc.next();

                        CadastroCliente(nome, cont);
                            cont++;
                            System.out.println("Deseja cadastrar um novo cliente? digite 1 para continuar");
                            op = sc.next();
			} else{
                            System.out.println("Espaço Insuficiente.");
                            break;
			}
		} while(op.equals("1"));
                
		for(int i= 0; i< cont; i++){
                    ImprimeClientes(i);
                }
                }
	static void CadastroCliente(String nome, int numero) {
            nome1[numero] = nome;
	}
	static void ImprimeClientes(int numero) {
            System.out.println("--------------------------------------------------");
            System.out.println("Cliente: "+ nome1[numero]);
            System.out.println("--------------------------------------------------");
	}
}