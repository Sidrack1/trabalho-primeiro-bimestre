
package trab06;
import java.util.Scanner;
        
public class Trab06 {
    
public static void main(String[] args) {		
		log();		
	}
	
	static void log(){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o login: ");
		String login01 = in.nextLine();
		
		System.out.println(verificaLogin(login01));
	}
	
	static boolean verificaLogin(String login02){
		if (login02.equals("admin"))
                    return true;
		else
                    return false;
	}

}