package com.holms.unit22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
    public static void main(String[] args) {

        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:"+
                                        "C:\\Users\\holms\\IdeaProjects\\UdemyChallenges\\_DBs\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        } catch (SQLException e){
            System.out.println("Something went wrong: "+e.getMessage());
        }

    }
}
