package Control;

import BancoDados.ConexaoBanco;
import Model.ClienteDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ClienteDAO {
    private Connection conectar;
    public ClienteDAO(){
        conectar = new ConexaoBanco().getConnection();
    }

    public String arrumaDataBanco(String data){
        String dia = data.substring(0,2);
        String mes = data.substring(3,5);
        String ano = data.substring(6);
        data = ano+"-"+mes+"-"+dia;
        return data;
    }

    public String arrumaDataMostra(String data){
        String dia = data.substring(8);
        String mes = data.substring(5,7);
        String ano = data.substring(0,4);
        data = dia+"-"+mes+"-"+ano;
        return data;
    }

    /*public String arrumaDataMostra2(String data){
        String[] divideData = data.split("-");
        String dataArrumada = divideData[2]+"-"+divideData[1]+"-"+divideData[0];
        return dataArrumada;
    }*/

    //****************************CADSTRO DE CLIENTE*******************************
    public void cadastrarCliente (ClienteDados dados){
        try{
            String sql = "INSERT INTO tb_cliente (nome_cliente,datanasc_cliente,cpf_cliente,celular_cliente,email_cliente) VALUES (?,?,?,?,?)";

            PreparedStatement inserir = conectar.prepareStatement(sql);
            String data = arrumaDataBanco(dados.getDatanasc_cliente());

            inserir.setString(1,dados.getNome_cliente());
            inserir.setString(2,data);
            inserir.setString(3,dados.getCpf_cliente());
            inserir.setString(4,dados.getCelular_cliente());
            inserir.setString(5, dados.getEmail_cliente());
            inserir.execute();
            inserir.close();
            System.out.println("CADASTRO OCORREU BEM");
        }catch (Exception erro){
            System.out.println("CADASTRO OCORREU MAL " + erro);
        }
    }

    //************************LISTAR CLIENTES**********************************8
    public void listarClientes(){
        try{
            String sql = "SELECT * FROM tb_cliente";
            PreparedStatement declarao = conectar.prepareStatement(sql);
            ResultSet listar;
            listar = declarao.executeQuery();
            Scanner tc = new Scanner(System.in);

            while(listar.next()){
                System.out.println(listar.getString("id_cliente"));
                System.out.println(listar.getString("nome_cliente"));
                System.out.println(arrumaDataMostra(listar.getString("datanasc_cliente")));
                System.out.println(listar.getString("cpf_cliente"));
                System.out.println(listar.getString("celular_cliente"));
                System.out.println(listar.getString("email_cliente"));
                System.out.println("**********************************************");
            }
            String pause = tc.nextLine();

        }catch (Exception erro){

        }
    }
    //*********************************ALTERAÇÃO***************************
    public void alterarCliente(ClienteDados dados){
        try{
            String sql = "UPDATE tb_cliente SET nome_cliente = ?, datanasc_cliente = ?, cpf_cliente = ?, celular_cliente = ?, email_cliente = ? WHERE id_cliente = ?";
            PreparedStatement alterar = conectar.prepareStatement(sql);

            String data = arrumaDataBanco(dados.getDatanasc_cliente());
            alterar.setString(1,dados.getNome_cliente());
            alterar.setString(2,data);
            alterar.setString(3, dados.getCpf_cliente());
            alterar.setString(4,dados.getCelular_cliente());
            alterar.setString(5, dados.getEmail_cliente());
            alterar.setInt(6,dados.getId());
            alterar.execute();
            alterar.close();
            System.out.println("Alteração com sucesso!!!");
        }catch (Exception erro){
            System.out.println("Alteração deu errado " + erro);
        }


    }
    public void excluirCliente(ClienteDados dados){
        try{
            String sql = "DELETE FROM tb_cliente WHERE id_cliente = ?";
            PreparedStatement excluir = conectar.prepareStatement(sql);

            excluir.setInt(1,dados.getId());
            excluir.execute();
            excluir.close();
            System.out.println("Exclusão com sucesso!!!");
        }catch (Exception erro){
            System.out.println("Exclusão sem sucesso!!!" + erro);
        }

    }
}
