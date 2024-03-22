package Ex1;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação matemática que deseja realizar:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair do programa");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo do programa...");
                break;
            }
            
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Por favor, digite um número entre 1 e 4 ou 0 para sair.");
                continue;
            }
            
            Numero num1 = new Numero();
            Numero num2 = new Numero();
            Numero res = new Numero();
            String opc = "S";
            
            while (opc.equalsIgnoreCase("s")) {
                System.out.print("\nDigite o primeiro número: ");
                num1.setValor(scanner.nextInt());
    
                System.out.print("Digite o segundo número: ");
                num2.setValor(scanner.nextInt());
    
                switch (opcao) {
                    case 1:
                        res.setValor(num1.getValor() + num2.getValor());
                        System.out.printf("O resultado da adição de %d e %d é igual a %d%n", num1.getValor(), num2.getValor(), res.getValor());
                        break;
                    case 2:
                        res.setValor(num1.getValor() - num2.getValor());
                        System.out.printf("O resultado da subtração de %d por %d é igual a %d%n", num1.getValor(), num2.getValor(), res.getValor());
                        break;
                    case 3:
                        res.setValor(num1.getValor() * num2.getValor());
                        System.out.printf("O resultado da multiplicação de %d por %d é igual a %d%n", num1.getValor(), num2.getValor(), res.getValor());
                        break;
                    case 4:
                        if (num2.getValor() == 0) {
                            System.out.println("Não é possível realizar a divisão por zero!");
                            continue;
                        }
                        res.setValor(num1.getValor() / num2.getValor());
                        System.out.printf("O resultado da divisão de %d por %d é igual a %d%n", num1.getValor(), num2.getValor(), res.getValor());
                        break;
                }
                
                System.out.print("\nDeseja realizar outra operação? (S/N): ");
                opc = scanner.next();
            }
            
            if (opc.equalsIgnoreCase("n")) {
                break; // Sai do loop principal se o usuário escolher 'n'
            }
        }    
    }
}