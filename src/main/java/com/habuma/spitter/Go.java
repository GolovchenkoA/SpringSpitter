package com.habuma.spitter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *  Created by головченко on 12.02.2017.
 */
public class Go {

    public static void main(String[] args) {

        String query = "SELECT info FROM INFORMATION";

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DataSource dataSource = (DataSource)context.getBean("dataSource");


        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            if (rs != null){
                while (rs.next()){
                    System.out.println(rs.getString("info"));
                }
            }
        }catch (SQLException e){

        }
    }
}
