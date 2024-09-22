import java.util.Scanner;

public class DesempenhoFuncionario {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o nome do Funcionario: ");
        String Funcionario = ler.nextLine();
        System.out.println("Digite a pontuação do Funcionario de 0-100");

        int pontuacao = ler.nextInt();
        String Demissão;

        if (pontuacao >= 0 & pontuacao < 30) {
            Demissão = "Insastifatória";
        }//fim if
        else if (pontuacao >= 30 & pontuacao < 50) {
            Demissão = "Regular";
        }//fim else if "Regular"
        else if (pontuacao >= 50 & pontuacao < 90) {
            Demissão = "Boa";
        }//fim else if "Bom"
        else if (pontuacao >= 90 & pontuacao <= 100) {
            Demissão = "Ótima";
        }//fim else if "Ótimo"
        else {
            Demissão = "Pontuação Inválida";
        }//fim ifelse
  
        System.out.print("A avaliação de "+Funcionario +" é: "+Demissão);
        
    }//fim main
}//fim class
