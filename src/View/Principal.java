package View;

import Model.ClienteDados;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        boolean continua = true;
        int opcao;
        Scanner tc = new Scanner(System.in);

        while (continua) {
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - ALTERAR");
            System.out.println("4 - EXCLUIR");
            System.out.println("0 - SAIR");
            System.out.print("Digite a opção desejada:");
            opcao = tc.nextInt();

            if(opcao == 0){
                continua = false;
            } else if (opcao == 1){
                System.out.println("****************************************");
               ClienteDigitacao.Cadastro();
            } else if (opcao == 2) {
                System.out.println("****************************************");
                ClienteDados.listarDados();
            }else if (opcao == 3){
                System.out.println("****************************************");
                ClienteDigitacao.Alterar();
            } else if (opcao == 4) {
                System.out.println("*****************************************");
                ClienteDigitacao.Excluir();
            }
        }
    }
}
