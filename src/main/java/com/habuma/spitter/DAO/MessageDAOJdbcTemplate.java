package com.habuma.spitter.DAO;

import com.habuma.spitter.model.Message;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by головченко on 14.02.2017.
 */
public class MessageDAOJdbcTemplate extends JdbcDaoSupport implements MessageDAO {

    @Override
    public void insert(Message message) {

    }

    @Override
    public Message getById(Long id) {
        return null;
    }
}
