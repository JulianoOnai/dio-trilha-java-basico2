import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        
        //TODO:Exibir as mensagens para o usuário
        
        //TODO:Obter pela classe Scanner os valores digitados no terminal
        
        //TODO:Exibir a mensagem final

        Scanner scanner=new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero da agência:");
        String numeroAgencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o numero de sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo disponível:");
        double saldo= scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ numeroAgencia +", conta "+ numeroConta +" e seu saldo de "+ saldo +" já está disponível para saque!");

        scanner.close();
    }
}
