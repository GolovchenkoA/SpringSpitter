package com.habuma.spitter;

import com.habuma.spitter.DAO.CustomerDAO;
import com.habuma.spitter.DAO.CustomerDAOImpl;
import com.habuma.spitter.DAO.CustomerRowMapper;
import com.habuma.spitter.DAO.SpringSpitterDBInfo;
import com.habuma.spitter.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import javax.naming.InitialContext;
import javax.naming.NamingException;
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

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

  //Connect to database via JDBC Connection


 /*       String query = "SELECT info FROM INFORMATION";

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

        }*/



         /*  try with JNDI */

/*        try {
            DataSource dataSourceJNDI = (DataSource) new InitialContext().lookup("/jdbc/SpitterDS");

            try(Connection connection = dataSourceJNDI.getConnection()){
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);

                if (rs != null){
                    while (rs.next()){
                        System.out.println(rs.getString("info"));
                    }
                }
            }catch (SQLException e){

            }

        } catch (NamingException e) {
            e.printStackTrace();
        }*/



        //CustomerRowMapper customerRowMapper = new CustomerRowMapper();
/*        CustomerRowMapper customerRowMapper = (CustomerRowMapper)context.getBean("jdbcTemplate");
        System.out.println(customerRowMapper.findCustomerNameById(1));*/
       /* System.out.println(customerRowMapper.findAll());*/


/*
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
*/
        //SimpleJdbcTemplate jdbcTemplate = (SimpleJdbcTemplate)context.getBean("jdbcTemplate");


        //CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        CustomerDAOImpl customerDAO = (CustomerDAOImpl)context.getBean("customerDAOImpl");

        //customerDAO.setJdbcTemplate((JdbcTemplate)context.getBean("jdbcTemplate"));
        System.out.println(customerDAO.findTotalCustomer());
/*        Customer customer = customerDAO.findByCustomerId(1);
        System.out.println(customer);*/

/*        JdbcTemplate jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
        jdbcTemplate.execute("create table employee (id int, name varchar(45))");
        jdbcTemplate.execute("insert into employee (id, name) values (1, 'A')");*/



    }
}
