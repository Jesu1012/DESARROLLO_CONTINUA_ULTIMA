package util;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConexionP {
    public static Connection databaseLink;

    public static Connection getConnection(){
        String hostname = "localhost";
        String port = "3306";
        String databaseName="";//<--Aqui el nombre
        String databaseUser="root";
        String databasePassword="as1012#J";
        String url = "jdbc:mysql://" + hostname + ":" + port + "/" + databaseName + "?useSSL=false";
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            databaseLink=DriverManager.getConnection(url,databaseUser,databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return databaseLink;

    }
}
