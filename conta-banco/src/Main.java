import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        int numero = input.nextInt();
        input.nextLine();
        System.out.print("Digite a agência: ");
        String agencia = input.nextLine();
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite o saldo: ");
        String saldoStr = input.nextLine();
        float saldo = Float.parseFloat(saldoStr);
        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);
        input.close();
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}
