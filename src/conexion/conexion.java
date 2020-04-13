package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    public String driver = "com.mysql.jdbc.Driver";
    public String basedatos = "punto_venta";
    public String nombrehost = "localhost";
    public String puerto = "3306";
    
    public String url = "jdbc:mysql://" + nombrehost + ":" + puerto + "/" + basedatos + "?useSSL=false";
    
    public String usuario = "root";
    public String clave = "az580580$";
    
    public Connection conexion() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return conn;
    }
}
