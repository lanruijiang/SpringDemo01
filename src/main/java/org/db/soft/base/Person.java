package org.db.soft.base;

import org.db.soft.base.dao.PersonDAO;
import org.db.soft.base.dao.PersonDAOImplements;

public class Person {
    private PersonDAO personDAO;

    public PersonDAO getPersonDAO() {
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        System.out.println("esecute personDAO method");
        this.personDAO = personDAO;
    }




    public void sayHello() {
        System.out.println( "I am chinese boy !!!" );
        String value = personDAO.operation( "老王" );
        System.out.println( value );
    }

}
