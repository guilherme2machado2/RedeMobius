package com.mobius.controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataBaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/clinicaMobius";
        String user = "postgres";
        String password = "AX30@8844";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
    }
}
