package com.habuma.spitter.DAO;

import com.habuma.spitter.model.Message;

/**
 * Created by головченко on 14.02.2017.
 */
public interface MessageDAO {

    public void insert(Message message);
    public Message getById(Long id);
}
