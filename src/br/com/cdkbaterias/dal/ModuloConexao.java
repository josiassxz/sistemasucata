/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cdkbaterias.dal;

import java.sql.*;


/**
 *
 * @author Josias
 */
public class ModuloConexao {
    //método responsavel por estabelecer a conexão com o banco

    public static Connection conector() {

        java.sql.Connection conexao = null;
        // a linha abaixo " chama" o driver que importei em bibliotecas

        String driver = "com.mysql.jdbc.Driver";
        // Armazenando informações referentes ao banco
        String url = "jdbc:mysql://localhost:3306/sucata";
        String user = "root";
        String password = "";
        boolean useSSL = true;
        //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
