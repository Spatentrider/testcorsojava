import java.util.Scanner;

import java.sql.*;

class DbManager {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

public class Esercizio2 {
    public static void main(String[] args) {


       String query = "SELECT id, nome, cognome, eta FROM studenti";

        try (
            Connection conn = DbManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {
                System.out.printf("ID:" + rs.getInt("id") +" Nome: " + rs.getString("nome") + "Cognome: " + rs.getString("Cognome") + "Età: " + rs.getInt("eta"));
            }
        } catch (SQLException e) {
            System.err.println("Errore durante l'accesso al database: ");
            e.printStackTrace();
    }
}
}
