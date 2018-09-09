package src.ConnectToMySQL;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;



    public class AddClassd {

        public static Connection connect = null;
        public static Statement statement = null;
        public static PreparedStatement ps = null;
        public static ResultSet rs = null;

        public static Properties loadProperties() throws IOException, ClassNotFoundException{
            Properties prop = new Properties();
            InputStream ism = new FileInputStream("src/secret.properties");
            prop.load(ism);
            ism.close();
            return prop;
        }
        public static Connection connectToMySql() throws Exception,ClassNotFoundException{
            Properties prop = loadProperties();
            String driverClass = prop.getProperty("MYSQLJDBC.driver");
            String url = prop.getProperty("MYSQLJDBC.url");
            String userName = prop.getProperty("MYSQLJDBC.user");
            String password = prop.getProperty("MYSQLJDBC.password");
            Class.forName(driverClass);
            connect = DriverManager.getConnection(url,userName,password);
            System.out.println("Database is connected");
            return connect;

        }

        public static void main(String[] args){
            try {
                //get the connection to database
                Connection myconn = connectToMySql();

                //create a statement
                Statement statement = myconn.createStatement();

                String add=" insert into Students(studentID,studentName,studentDOB)" +
                        "values(109, 'Md. hh', '10-10-2000')";
                statement.executeLargeUpdate(add);
                System.out.println("Insertion complete");

            }catch (Exception ex){
                ex.printStackTrace();
            }
        }


    }


