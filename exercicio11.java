package trab11;
import java.util.Scanner;
public class Trab11 {
    
    public static void main(String[] args) {
        dataExt();
    }
    
    static void dataExt(){
    Scanner in= new Scanner(System.in);
            System.out.println("Digite o dia: ");
            Integer dia= in.nextInt();
            System.out.println("Digite o mês: ");
            Integer mes= in.nextInt();
            System.out.println("Digite o ano: ");
            Integer ano= in.nextInt();
        if(12>=mes){
            if(mes<1){ System.out.println("A data é inválida");
            }
            if(mes==1){
                if(31<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Janeiro de "+ano);
            }}
            if(mes==2){
                if(28<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Fevereiro de "+ano);
            }}
            if(mes==3){
                if(31<dia){System.out.println("A data é inválida");
            }
            else {System.out.println(dia+" de Março de "+ano);
            }}
            if(mes==4){
                if(30<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Abril de "+ano);
            }}
            if(mes==5){
                if(31<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Maio de "+ano);
            }}
            if(mes==6){
                    if(30<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Junho de "+ano);
            }}
            if(mes==7){
                if(31<dia){System.out.println("A data é inválida");
            }
                else{System.out.println(dia+" de Julho de "+ano);
            }}
            if(mes==8){
                if(31<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Agosto de "+ano);
            }}
            if(mes==9){
                if(30<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Setembro de "+ano);
            }}
            if(mes==10){
                if(31<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Outubro de "+ano);
            }}
            if(mes==11){
                if(30<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Novembro de "+ano);
            }}
            if(mes==12){
                if(31<dia){System.out.println("A data é inválida");
            }
            else{System.out.println(dia+" de Dezembro de "+ano);
            }}}
        else{System.out.println("A data é inválida");
}
}
}