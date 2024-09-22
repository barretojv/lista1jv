import java.util.Scanner;
public class bonusSalario {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner (System.in);

        System.out.println("Digite o Salário base do funcionário: ");
        double salarioBase = ler.nextDouble();

        System.out.println("Qual o desempenho do funcionário? (1- ótimo, 2- bom, 3- Regular)");
        String DesempenhoFuncionario = ler.next().toLowerCase();

        double bonus = 0.0;

        switch (DesempenhoFuncionario) {
            case "1":
            case "otimo":
            case "ótimo":
                bonus = 0.20;
                break;
            case "2":
            case "bom":
                bonus = 0.10;
                break;
            case "3":
            case "regular":
                bonus = 0.05;
                break;
            default:
                System.out.println("Valor inválido, bônus não adicionado.");
                break;
        }
        
        double salarioBonus = salarioBase + (salarioBase * bonus);

        System.out.println("O salário com bônus R$:"+salarioBonus);


    }
}
