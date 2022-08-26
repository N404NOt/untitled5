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
 * Date: 2022-08-25
 * Time: 20:20
 */
public class JDBCInsert {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("1234");
        //创建连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        int id = scanner.nextInt();
        System.out.println("请输入姓名");
        String name= scanner.next();
        String sql = "insert into student values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        System.out.println("statement" + preparedStatement);
        int n = preparedStatement.executeUpdate();
        System.out.println(n);
        preparedStatement.close();
        connection.close();
    }
}
