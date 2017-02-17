package com.habuma.spitter.DAO;

import com.habuma.spitter.model.Customer;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.List;

/**
 * Created by головченко on 14.02.2017.
 */

@Component
public class CustomerDAOImpl extends SimpleJdbcDaoSupport {

/*    @Autowired
    public void setDatasource(DataSource datasource) {
        super.setDataSource(datasource);
    }*/


    @Autowired
    private DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }


    public Customer findByCustomerId(int custId){

        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

        Customer customer = (Customer) getSimpleJdbcTemplate().queryForObject(sql, new CustomerRowMapper(), new Object[]{custId});

        return customer;
    }


    public List<Customer> findAll(){

        String sql = "SELECT * FROM CUSTOMER";


        List<Customer> customers =
                getSimpleJdbcTemplate().query(sql,
                        ParameterizedBeanPropertyRowMapper.newInstance(Customer.class));

        return customers;
    }

    public String findCustomerNameById(int custId){

        String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";

        String name = getSimpleJdbcTemplate().queryForObject(sql, String.class, custId);
        /*String name = simpleJdbcTemplate.queryForObject(sql, new Object[] { custId }, String.class);*/

        return name;

    }

    public int findTotalCustomer(){

        String sql = "SELECT COUNT(*) FROM CUSTOMER";

        int total = getSimpleJdbcTemplate().queryForInt(sql);

        return total;
    }
}
