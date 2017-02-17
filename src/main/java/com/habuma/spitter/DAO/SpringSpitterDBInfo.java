package com.habuma.spitter.DAO;

import com.habuma.spitter.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

/**
 * Created by головченко on 14.02.2017.
 */
public class SpringSpitterDBInfo {

    @Autowired
    SimpleJdbcTemplate simpleJdbcTemplate;

    public String getInfo(Long id){

        String sql = "SELECT name FROM employee where id = ?";

/*        String name = (String) simpleJdbcTemplate.queryForObject(
                sql, String.class);*/
        String name = simpleJdbcTemplate.queryForObject(sql, ParameterizedBeanPropertyRowMapper.newInstance(String.class),new Object[]{id});

        //simpleJdbcTemplate.queryForObject(sql,String.class);

        return name;

    }
}
