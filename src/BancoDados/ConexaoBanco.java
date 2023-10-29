package BancoDados;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost:3307/empresa252","root","");
        }catch (Exception erro){
            throw new RuntimeException(erro);
        }
    }

    public static void main(String[] args) {
        try{
            new ConexaoBanco().getConnection();
            JOptionPane.showMessageDialog(null,"CONEXAO DEU BOM");
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null,"CONEXAO DEU RUIM" + erro);
        }
    }
}
