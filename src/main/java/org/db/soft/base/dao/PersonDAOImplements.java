package org.db.soft.base.dao;

public class PersonDAOImplements implements PersonDAO{
    @Override
    public String operation(String name) {

        return "my name is " + name;


    }
}
