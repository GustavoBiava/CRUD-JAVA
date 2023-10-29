package Model;

import Control.ClienteDAO;

public class ClienteDados {
    private int id;
    private String nome_cliente;
    private String datanasc_cliente;
    private String cpf_cliente;
    private String celular_cliente;
    private String email_cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getDatanasc_cliente() {
        return datanasc_cliente;
    }

    public void setDatanasc_cliente(String datanasc_cliente) {
        this.datanasc_cliente = datanasc_cliente;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getCelular_cliente() {
        return celular_cliente;
    }

    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public static void enviarDados(ClienteDados dados){
        ClienteDAO enviar = new ClienteDAO();
        enviar.cadastrarCliente(dados);
    }

    public static void listarDados(){
        ClienteDAO listar = new ClienteDAO();
        listar.listarClientes();
    }

    public static void alterarDados(ClienteDados dados){
        ClienteDAO alterar = new ClienteDAO();
        alterar.alterarCliente(dados);
    }

    public static void excluirDados(ClienteDados dados){
        ClienteDAO excluir = new ClienteDAO();
        excluir.excluirCliente(dados);
    }
}
