import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

        //exibir mensagem para o usuario digitar e obtenção de dados
        System.out.println("Bem Vindo a sua nova criação de conta bancaria!!!");
        System.out.println("Por favor digite seu primeiro nome e sobrenome: ");
        String nome = scan.nextLine();

        System.out.println("Digite sua agencia bancaria: ");
        String agencia = scan.nextLine();
        
        System.out.println("Digite numero da conta: ");
        int numero = scan.nextInt();
       
        System.out.println("Digite seu saldo bancario: ");
        Double saldo = scan.nextDouble();
        //mensagem final da conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        scan.close();
    }
}
