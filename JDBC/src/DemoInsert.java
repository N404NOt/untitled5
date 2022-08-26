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
 * Time: 18:12
 */
public class DemoInsert {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("1234");
        Connection connection = dataSource.getConnection();
        String sql = "insert into student values (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        Scanner scanner = new Scanner(System.in);
        int a=1;
        while (a==1){
            System.out.println("请输入学号:");
            statement.setInt(1,scanner.nextInt());
            System.out.println("请输入姓名");
            statement.setString(2,scanner.next());
            int n = statement.executeUpdate();
            System.out.println("statement" + scanner);
            System.out.println();
            System.out.println("是否继续添加？     0.退出，  1.继续");
            a=scanner.nextInt();
        }
        statement.close();
        connection.close();
    }
}
