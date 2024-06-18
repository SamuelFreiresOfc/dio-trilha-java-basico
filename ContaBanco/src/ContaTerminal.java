import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero ;
        String agencia ; 
        String nomeCliente ;
        double saldo = 0.00 ;

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Banco: Por favor, digite o seu nome !"); 
        nomeCliente = sc.nextLine();
        System.out.println("Banco: Por favor, digite o número de sua agência !");        
        agencia = sc.nextLine();
        System.out.println("Banco: Por favor, agora digite o número da sua conta !");
        numero = sc.nextInt();

        
        System.out.println("----------------- Banco -----------------");
        System.out.println("Sua conta foi criada com sucesso!");
        System.out.println("Nome:"+nomeCliente);
        System.out.println("Agência: "+agencia);
        System.out.println("Número da conta: " +numero );
        System.out.println("Saldo: " +saldo);
        System.out.println("----------------- Banco -----------------");

        sc.close();

    }
}
