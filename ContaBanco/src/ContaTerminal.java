import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        
        //TODO:Exibir as mensagens para o usuário
        
        //TODO:Obter pela classe Scanner os valores digitados no terminal
        
        //TODO:Exibir a mensagem final

        Scanner scanner=new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero de sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o saldo disponível:");
        double saldo= scanner.nextDouble();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ conta +" e seu saldo de "+ saldo +" já está disponível para saque!");

        scanner.close();
    }
}
