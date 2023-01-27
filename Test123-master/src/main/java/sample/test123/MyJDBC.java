package sample.test123;

import java.sql.*;

public class MyJDBC {

    /**
     * Perform a SELECT.
     *
     * @param query the query to execute, must be the entire query.
     * @return the output from the query.
     * @throws SQLException on invalid syntax or when a database access error occurs.
     * @throws SQLTimeoutException when connection times out. This is a subclass of SQLException and can thus be caught
     * as such.
     */
    public static ResultSet communicateWithDatabase(String query) throws SQLException {

        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alimento", "root", "");


            Statement statement = connection.createStatement();


            return statement.executeQuery(query);

        } catch (Exception e) {
            // Hier kom je eigenlijk alleen als de gebruikersnaam niet klopt, het wachtwoord niet klopt, of je database
            // offline is.
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Perform an UPDATE or an INSERT.
     *
     * @param query the command to execute.
     * @throws SQLException on invalid syntax or when a database access error occurs.
     * @throws SQLTimeoutException when connection times out. This is a subclass of SQLException and can thus be caught
     * as such.
     */
    public static void updateDatabase(String query) throws SQLException {
        // Deze functie is bijna identiek aan de vorige.
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alimento", "root", "");

            Statement statement = connection.createStatement();

            statement.executeUpdate(query); // Deze regel is anders, deze kan alleen queries uitvoeren die GEEN SELECT zijn.

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}