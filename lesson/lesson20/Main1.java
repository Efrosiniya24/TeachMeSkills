package lesson20;


import java.sql.*;
public class Main1 {
    //    Задача 1:
//            1.1 Создать модель пользователя в Java(User).
//            1.2 Создать соответствующую модели таблицу в базе данных(users).
//            1.3 Вытянуть с помощью JDBC информацию о пользователе с id=1.
//            1.4 Распарсить данные из ResultSet в объект User
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Driver driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        Connection connection =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/User", "root", "1111");
        Statement statement = connection.createStatement();
//        statement.execute("create table user(id INT PRIMARY KEY , username VARCHAR(255) , phoneNumber VARCHAR(20))");
//
//        User user1 = new User(1, "dasfg", "+27528343");
//        User user2 = new User(2, "ergfdas", "+34637832");
//        User user3 = new User(3, "zdfbsdase", "+354657654");
//
//        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user (id, username, phoneNumber) VALUES (?, ?, ?)");
//        preparedStatement.setInt(1, user1.getId());
//        preparedStatement.setString(2, user1.getName());
//        preparedStatement.setString(3, user1.getPhoneNumber());
//        preparedStatement.execute();
//
//        PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO user (id, username, phoneNumber) VALUES (?, ?, ?)");
//        preparedStatement.setInt(1, user2.getId());
//        preparedStatement.setString(2, user2.getName());
//        preparedStatement.setString(3, user2.getPhoneNumber());
//        preparedStatement.execute();
//
//        PreparedStatement preparedStatement2 = connection.prepareStatement("INSERT INTO user (id, username, phoneNumber) VALUES (?, ?, ?)");
//        preparedStatement.setInt(1, user3.getId());
//        preparedStatement.setString(2, user3.getName());
//        preparedStatement.setString(3, user3.getPhoneNumber());
//        preparedStatement.execute();

        ResultSet rs = statement.executeQuery("SELECT * from user");
        while (rs.next()) {
            if (rs.getInt("id") == 1) {
                User user4 = new User(1, rs.getString("username"), rs.getString("phoneNumber"));
                System.out.println(user4.getId() + " " + user4.getName() + " " + user4.getPhoneNumber());
                break;
            }
        }


    }
}
