package com.infox.dal;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author fellpe
 */
public class ModuloConexao {
    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "1234";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Conexão com o banco de dados FALHOU:\n"+e);
            return null;
        }
    }
    
}
