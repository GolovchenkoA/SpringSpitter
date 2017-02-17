package com.habuma.spitter.DAO;

import com.habuma.spitter.model.Customer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by головченко on 13.02.2017.
 */
public class CustomerRowMapper implements RowMapper {

/*    @Autowired
    private Customer customer;*/

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer customer = new Customer();
        customer.setCust_id(rs.getInt("CUST_ID"));
        customer.setName(rs.getString("NAME"));
        customer.setAge(rs.getInt("AGE"));
        return customer;
    }
}
