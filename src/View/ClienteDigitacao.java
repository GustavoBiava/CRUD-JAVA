package View;

import Model.ClienteDados;
import java.util.Scanner;

public class ClienteDigitacao {
    public static void Cadastro(){

        boolean continua = true;
        char opcao = 'S';
        Scanner tc = new Scanner(System.in);
        ClienteDados dados = new ClienteDados();

        while(continua){
            tc.nextLine();
            System.out.print("Digite nome do cliente:");
            dados.setNome_cliente(tc.nextLine());

            System.out.print("Digite data de nascimento do cliente:");
            dados.setDatanasc_cliente(tc.nextLine());

            System.out.print("Digite CPF do cliente:");
            dados.setCpf_cliente(tc.nextLine());

            System.out.print("Digite celular do cliente:");
            dados.setCelular_cliente(tc.nextLine());

            System.out.print("Digite e-mail do cliente:");
            dados.setEmail_cliente(tc.nextLine());
            ClienteDados.enviarDados(dados);

            System.out.println("Deseja continuar?(S/N):");
            opcao = tc.next().toUpperCase().charAt(0);

            if(opcao == 'N'){
                continua = false;
            }
        }
    }
    //*************************** ALTERARÇÃO *************************************
    public static void Alterar(){
        ClienteDados.listarDados();
        Scanner tc = new Scanner(System.in);
        ClienteDados dados = new ClienteDados();

        System.out.println("Digite o ID que deseja alterar: ");
        dados.setId(tc.nextInt());

        tc.nextLine();
        System.out.println("Digite o nome:");
        dados.setNome_cliente(tc.nextLine());

        System.out.println("Digite data de nascimento:");
        dados.setDatanasc_cliente(tc.nextLine());

        System.out.println("Digite CPF do cliente:");
        dados.setCpf_cliente(tc.nextLine());

        System.out.println("Digite celular cliente:");
        dados.setCelular_cliente(tc.nextLine());

        System.out.println("Digite email do cliente:");
        dados.setEmail_cliente(tc.nextLine());
        ClienteDados.alterarDados(dados);
    }
    //*********************EXCLUSÃO***********************************
    public static void Excluir(){
        Scanner tc = new Scanner(System.in);
        ClienteDados dados = new ClienteDados();

        System.out.println("Digite o ID que deseja excluir:");
        dados.setId(tc.nextInt());
        ClienteDados.excluirDados(dados);
    }
}
