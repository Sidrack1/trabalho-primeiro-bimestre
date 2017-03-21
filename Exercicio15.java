package exercicio15;
import java.util.Scanner;

public class Exercicio15 {
    static String[] nome1 = new String[10];
    static String[] email1 = new String[10];
    static String[] telefone1 = new String[10];
    static int cont = 0;

	public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String nome = "";
            String telefone = "";
            String email = "";
            String op = "1";

		do {
                    if(cont <= 9){
                        System.out.println("Digite Seu Nome: ");
                        nome = sc.next();
                        System.out.println("Digite Seu Telefone:");
                        telefone = sc.next();
                        System.out.println("Digite Seu Email:");
                        email = sc.next();

                        CadastroCliente(nome, email, telefone, cont);
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
	static void CadastroCliente(String nome, String email, String telefone, int numero) {
            nome1[numero] = nome;
            telefone1[numero] = telefone;
            email1[numero] = email;
	}
	static void ImprimeClientes(int numero) {
            System.out.println("--------------------------------------------------");
            System.out.println("Cliente: "+ nome1[numero]);
            System.out.println("Telefone: "+ telefone1[numero]);
            System.out.println("E-mail: "+ email1[numero]);
            System.out.println("--------------------------------------------------");
	}
}