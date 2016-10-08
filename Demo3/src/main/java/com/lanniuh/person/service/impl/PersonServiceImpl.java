package com.lanniuh.person.service.impl;

import com.github.pagehelper.Page;
import com.lanniuh.person.dao.PersonDao;
import com.lanniuh.person.entity.Person;
import com.lanniuh.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linjian
 * 16/8/11.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    public Page<Person> getPersonPaged() {
        return personDao.getPersonPaged();
    }
}
