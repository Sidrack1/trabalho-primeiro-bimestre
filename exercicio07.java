package trab07;
import java.util.Scanner;
        
public class Trab07 {
    
public static void main(String[] args) {		
		resultLog();
	}
	
	static void resultLog(){
            Scanner in = new Scanner(System.in);
		
	    System.out.print("Digite o usuario: ");
            String login = in.nextLine();
                
            System.out.println("Digite a senha: ");
            String senha = in.nextLine();
		
            System.out.println(usuSenha(login, senha));
	}
	
	static String usuSenha(String login,String senha){
            if (login.equals("admin") && senha.equals("admin"))
                return "Login efetuado com sucesso!";
            else
                return "Usuario e/ou senha incorretos.";
	}
       
}