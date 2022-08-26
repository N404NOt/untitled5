import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-08-26
 * Time: 18:25
 */
public class DemoDelete {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("1234");
        Connection connection = dataSource.getConnection();
        String sql = "delete from student where name = ?";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除人的名字：");
        String name =scanner.next();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,name);
        int n = statement.executeUpdate();
        System.out.println(statement);
        System.out.println(n);
        statement.close();
        connection.close();
    }
}
