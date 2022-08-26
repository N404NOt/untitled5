import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-08-26
 * Time: 22:35
 */
public class DemoUpdate {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("1234");
        Connection connection = dataSource.getConnection();
        String sql = "update student set name = '李四' where id = 1";
        PreparedStatement statement = connection.prepareStatement(sql);
        System.out.println(statement);
        int n = statement.executeUpdate();
        System.out.println(n);
    }
}
