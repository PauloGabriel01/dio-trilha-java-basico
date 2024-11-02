import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: "Conhecer e importar a classe Scanner"

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        /* 
         * int numero_conta
         * String agencia
         * 
         * double saldo
         */
        // Exibir as mensagens para o nosso usuário
        System.out.println("Conta Bancária");
        System.out.println("Nome do Cliente: ");
        String nome_cliente = scanner.next();
        
        System.out.println("Número da Conta: ");
        int numero_conta = scanner.nextInt();
        
        System.out.println("Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Saldo: ");
        double saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nome_cliente, agencia, numero_conta, saldo);
    }
}
