package com.habuma.spitter.model;

import org.springframework.stereotype.Component;

/**
 * Created by головченко on 13.02.2017.
 */
@Component
public class Customer {

    int cust_id;
    String name;
    int age;

    public Customer(){}

    public Customer(Integer custid, String name, int age) {
        cust_id = custid;
        this.name = name;
        this.age = age;
    }

    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
