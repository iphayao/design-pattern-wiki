package com.iphayao.demo;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for(Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("single")) {
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}