package com.example.web_ordinario_u2.utils;


import java.sql.*;

public class Conn {
        public Connection getConnection() {
            final String DBNAME = "examen_4b",
                    USERNAME = "root",
                    PASSWORD = "root",
                    TIMEZONE = "America/Mexico_City",
                    USESSL = "false",
                    PUBLICKEY = "true";
            String dataSource = String.format("jdbc:mysql://localhost:3306/%s?user=%s" +
                            "&password=%s&serverTimezone=%s&useSSL=%s&allowPublicKeyRetrieval=%s",
                    DBNAME, USERNAME, PASSWORD, TIMEZONE, USESSL, PUBLICKEY);
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                return (Connection) DriverManager.getConnection(dataSource);
            } catch (SQLException e) {
                System.out.println(this.getClass().getCanonicalName() +
                        "->" + e.getMessage());
            }
            return null;
        }
        public void close(Connection conn, PreparedStatement ps, ResultSet rs){
            try {
                if (conn!=null){
                    conn.close();
                }
                if (ps!=null){
                    ps.close();
                }
                if (rs!=null){
                    rs.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

}

