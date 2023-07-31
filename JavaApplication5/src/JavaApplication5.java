
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Main {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
        Statement state = con.createStatement(ResultSet.CONCUR_READ_ONLY, ResultSet.TYPE_FORWARD_ONLY, ResultSet.TYPE_SCROLL_INSENSITIVE);
        ResultSet rs = state.executeQuery("select * from murtaza.customer");
        while (rs.next()) {
            int i = rs.getInt("age");
            String name = rs.getString("name");
            System.out.println(i + " " + name);

        }
    }
}
