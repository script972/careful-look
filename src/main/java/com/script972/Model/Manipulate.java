package com.script972.Model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by script972 on 27.12.2016.
 */
public class Manipulate {

    private static final String URL="jdbc:mysql://localhost:3306/cklad";
    private  static  final String USERNAME="root";
    private  static  final String PASSWORD="root";
    public void start() throws SQLException {
        DBProcessor db=new DBProcessor();
        Connection conn=db.getConnection(URL, USERNAME, PASSWORD);
        String queryForLogin="SELECT * from cklad.user WHERE login='mga73'";
        Statement statement=conn.createStatement();
        ResultSet resultSet= statement.executeQuery(queryForLogin);

        while(resultSet.next()){
            int id=resultSet.getInt("id");
            String surname=resultSet.getString("surname");
            String name=resultSet.getString("name");
            String patronymic=resultSet.getString("patronymic");
            int degree=resultSet.getInt("degree");
            String position=resultSet.getString("position");
            int rank=resultSet.getInt("rank");
            String phonenumber=resultSet.getString("phonenumber");
            int idSubdivisionPost=resultSet.getInt("id_subdivison_post");
            String photo=resultSet.getString("photo");
            String login=resultSet.getString("login");
            String password=resultSet.getString("password");
            String email=resultSet.getString("email");
            String lastVision=resultSet.getString("last_vision");
            String IPLastVision=resultSet.getString("IP_last_vision");
            User user=new User(id,surname, name, patronymic, degree, position, rank, phonenumber, idSubdivisionPost, photo,
                    login, password, email, lastVision, IPLastVision);
            System.out.println(user.toString());

        }
        statement.close();
        conn.close();
    }

    public boolean varified(String loginF, String passwordF) throws SQLException{
        DBProcessor db=new DBProcessor();
        Connection conn=db.getConnection(URL, USERNAME, PASSWORD);
        String queryForLogin="SELECT * from cklad.user WHERE login='"+loginF+"'";
        Statement statement=conn.createStatement();
        ResultSet resultSet= statement.executeQuery(queryForLogin);
        String login;
        boolean out=false;
        String password;
        while(resultSet.next()){
            password=resultSet.getString("password");
            if (password.equals(passwordF))
            {
                out=true;
                break;
            }
        }

        statement.close();
        conn.close();
        return out;
    }
}
